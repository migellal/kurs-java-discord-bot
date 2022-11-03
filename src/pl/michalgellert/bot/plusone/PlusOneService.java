package pl.michalgellert.bot.plusone;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.user.User;
import pl.michalgellert.bot.Tokens;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlusOneService {

    private final DiscordApi api;
    private final List<PointsModel> pointsList = new ArrayList<>();
    private final Map<Long, String> usersMap = new HashMap<>();

    public PlusOneService() {
        this.api = new DiscordApiBuilder()
                .setToken(Tokens.PLUS_ONE_BOT_TOKEN)
                .setAllIntents()
                .login()
                .join();
    }

    public String getInvitation() {
        return api.createBotInvite();
    }

    public DiscordApi getApi() {
        return api;
    }

    public String findNameById(Long takerId) {
        String name = null;
        CompletableFuture<User> userById = api.getUserById(takerId);
        try {
            User user = userById.get(5, TimeUnit.SECONDS);
            name = user.getName();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.err.println(e);
        }
        return name;
    }

    public String addPlus(Long authorId, String authorName, Long takerId, String takerName) {
        if(authorId.equals(takerId)) {
            return "Brzydko robisz " + authorName + "!";
        } else {
            pointsList.add(new PointsModel(authorId, takerId));
            usersMap.put(authorId, authorName);
            usersMap.put(takerId, takerName);
            long points = pointsList
                    .stream()
                    .filter(p -> p.takerId().equals(takerId))
                    .count();
            return "Nazwa: " + takerName + "\nPunkty: " + points;
        }
    }

    public String getPointsSummary() {
        LinkedHashMap<String, Long> takerLinkedHashMap = mapOfNameAndPoints(PointsModel::takerId);
        LinkedHashMap<String, Long> giverLinkedHashMap = mapOfNameAndPoints(PointsModel::giverId);

        StringBuilder stringBuilder = new StringBuilder();
        convertUsersAndPointsToText("Najbardziej pomocni:\n", takerLinkedHashMap, stringBuilder);
        stringBuilder.append("\n");
        convertUsersAndPointsToText("Najbardziej szczodrzy:\n", giverLinkedHashMap, stringBuilder);

        return stringBuilder.toString();
    }

    private LinkedHashMap<String, Long> mapOfNameAndPoints(Function<PointsModel, Long> mapParam) {
        return pointsList.stream()
                .map(mapParam)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        v -> usersMap.get(v.getKey()), Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new
                ));
    }

    private void convertUsersAndPointsToText(String title, LinkedHashMap<String, Long> linkedHashMap, StringBuilder stringBuilder) {
        stringBuilder.append(title);
        linkedHashMap.forEach((k, v) -> {
            stringBuilder.append(k);
            stringBuilder.append(": ");
            stringBuilder.append(v);
            stringBuilder.append("\n");
        });
    }
}
