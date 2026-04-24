import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            ModInterface obj = (ModInterface) Naming.lookup("rmi://localhost/ModService");
            int result = obj.mod(a, b);

            System.out.println("Modulus = " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}