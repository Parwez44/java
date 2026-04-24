package server;

import model.User;
import model.Message;
import storage.MessageStore;

import java.io.*;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Socket socket;
    private User user;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String username = in.readLine();
            user = new User(username, out);
            UserManager.addUser(user);

            String msg;
            while ((msg = in.readLine()) != null) {
                Message message = new Message(user.getName(), msg);
                MessageStore.store(message);
                MessageRouter.broadcast(message);
            }
        } catch (Exception e) {
        } finally {
            UserManager.removeUser(user);
        }
    }
}