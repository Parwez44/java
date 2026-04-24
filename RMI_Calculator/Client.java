import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator stub = (Calculator) registry.lookup("CalculatorService");

            
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            int choice;

            do {
                System.out.println("\nChoose Operation:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + stub.add(a, b));
                        break;
                    case 2:
                        System.out.println("Result: " + stub.subtract(a, b));
                        break;
                    case 3:
                        System.out.println("Result: " + stub.multiply(a, b));
                        break;
                    case 4:
                        System.out.println("Result: " + stub.divide(a, b));
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 5);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}