import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;
}

class ShoppingCart {

    ArrayList<Product> cart = new ArrayList<>();

    void addProduct(Product product) {
        cart.add(product);
    }

    void removeProduct(String productName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).name.equalsIgnoreCase(productName)) {
                cart.remove(i);
                System.out.println("Product removed.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    double calculateTotalCost() {
        double sum = 0;
        for (Product p : cart) {
            sum += p.price;
        }
        return sum;
    }

    void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\nProducts in Cart:");
        for (Product p : cart) {
            System.out.println("Name: " + p.name + " | Price: " + p.price);
        }

        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class qn3 {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("1. Add Product");
                System.out.println("2. Remove Product");
                System.out.println("3. Display Cart");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        Product p = new Product();

                        System.out.print("Enter Product Name: ");
                        p.name = sc.nextLine();

                        System.out.print("Enter Product Price: ");
                        p.price = sc.nextDouble();
                        sc.nextLine();

                        cart.addProduct(p);
                        System.out.println("Product added.");
                        break;

                    case 2:
                        System.out.print("Enter Product Name to Remove: ");
                        String name = sc.nextLine();
                        cart.removeProduct(name);
                        break;

                    case 3:
                        cart.displayCart();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 4);
        }
    }
}
