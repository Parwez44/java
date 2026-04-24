package server;

import model.Message;
import model.User;

public class MessageRouter {
    public static void broadcast(Message message) {
        for (User user : UserManager.getUsers()) {
            user.getOut().println(message.getSender() + ": " + message.getContent());
        }
    }
}