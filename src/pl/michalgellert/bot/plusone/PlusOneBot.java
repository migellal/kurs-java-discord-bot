package pl.michalgellert.bot.plusone;

public class PlusOneBot {

    public static void main(String[] args) {
        PlusOneService service = new PlusOneService();

        System.out.println(service.getInvitation());

        service.getApi().addMessageCreateListener(event -> {
            String messageContent = event.getMessageContent();
            Long authorId = event.getMessageAuthor().getId();
            String authorName = event.getMessageAuthor().getDisplayName();
            if(messageContent.startsWith("+1") && messageContent.substring(3).startsWith("<@")) {
                String stringId = messageContent.substring(5, messageContent.indexOf(">"));
                Long takerId = Long.parseLong(stringId);
                String takerName = service.findNameById(takerId);
                String addPlusMessage = service.addPlus(authorId, authorName, takerId, takerName);
                event.getChannel().sendMessage(addPlusMessage);
                System.out.println(addPlusMessage);
            } else if (messageContent.equals("<@1035269521428193292> punkty")) {
                String pointsSummary = service.getPointsSummary();
                event.getChannel().sendMessage(pointsSummary);
                System.out.println(pointsSummary);
            }
            // <@1035269521428193292> punkty

        });
    }
}
