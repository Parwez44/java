package storage;

import model.Message;
import java.util.*;

public class MessageStore {
    private static List<Message> messages = new ArrayList<>();

    public static void store(Message message) {
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }
}