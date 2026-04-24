package server;

import model.User;
import java.util.*;

public class UserManager {
    private static Set<User> users = new HashSet<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static void removeUser(User user) {
        users.remove(user);
    }

    public static Set<User> getUsers() {
        return users;
    }
}