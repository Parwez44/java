import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ChatApp app = (ChatApp) registry.lookup("ChatService");

            String message;

            System.out.println("Chat App Started (type 'exit' to stop)");

            do {
                System.out.print("You: ");
                message = sc.nextLine();

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("Chat ended.");
                    break;
                }

                String response = app.getResponse(message);
                System.out.println("App: " + response);

            } while (true);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}