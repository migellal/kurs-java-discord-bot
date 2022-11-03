package pl.michalgellert.bot.mirror;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import pl.michalgellert.bot.Tokens;

public class MirrorBot {

    public static void main(String[] args) {
        DiscordApi api = new DiscordApiBuilder()
                .setToken(Tokens.MIRROR_BOT_TOKEN)
                .setAllIntents()
                .login()
                .join();

        System.out.println(api.createBotInvite());

        api.addMessageCreateListener(event -> {
            String messageContent = event.getMessageContent();
            if (messageContent.contains("lustereczko powiedz przecie")) {
                event.getChannel().sendMessage(event.getMessageAuthor().getDisplayName() +
                        " jesteś najpiękniejszy w świecie!");
            }
        });
    }
}
