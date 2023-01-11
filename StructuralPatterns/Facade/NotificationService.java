package StructuralPatterns.Facade;

public class NotificationService {
    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message(target), target);
        connection.disconnect();
    }
}
