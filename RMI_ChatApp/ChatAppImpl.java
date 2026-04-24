import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ChatAppImpl extends UnicastRemoteObject implements ChatApp {

    protected ChatAppImpl() throws RemoteException {
        super();
    }

    public String getResponse(String message) {
        message = message.toLowerCase();

        if (message.contains("hello") || message.contains("hi")) {
            return "Hi! How can I help you?";
        } 
        else if (message.contains("name")) {
            return "I am your Chat App 🤖";
        } 
        else if (message.contains("how are you")) {
            return "I am doing great 😊";
        } 
        else if (message.contains("bye")) {
            return "Goodbye! 👋";
        } 
        else {
            return "Sorry, I didn't understand that.";
        }
    }
}