import java.rmi.Naming;

public class RMIServer {
    public static void main(String[] args) {
        try {
            ModInterface obj = new ModImpl();
            Naming.rebind("ModService", obj);
            System.out.println("RMI Server ready...");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}