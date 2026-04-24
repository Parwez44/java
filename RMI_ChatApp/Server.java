import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            ChatAppImpl app = new ChatAppImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ChatService", app);

            System.out.println("Chat App Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}