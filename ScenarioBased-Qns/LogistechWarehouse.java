import java.util.*;
import java.time.LocalDate;

// Interface
interface Taxable {
    double calculateTax();
}

// Abstract Class
abstract class Item implements Taxable {
    protected String itemID;
    protected String name;
    protected double basePrice;

    public Item(String itemID, String name, double basePrice) {
        this.itemID = itemID;
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getItemID() {
        return itemID;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double calculateTax();

    public double getPriceWithTax() {
        return basePrice + calculateTax();
    }

    public String toString() {
        return "ID: " + itemID +
               ", Name: " + name +
               ", Base Price: $" + basePrice +
               ", Final Price: $" + String.format("%.2f", getPriceWithTax());
    }
}

// Perishable Item
class PerishableItem extends Item {
    private LocalDate expiryDate;

    public PerishableItem(String itemID, String name, double basePrice, String expiryDate) {
        super(itemID, name, basePrice);
        this.expiryDate = LocalDate.parse(expiryDate);
    }

    @Override
    public double calculateTax() {
        return basePrice * 0.05; // 5% tax
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    @Override
    public String toString() {
        return super.toString() + ", Expiry: " + expiryDate +
               (isExpired() ? " (Expired)" : "");
    }
}

// Electronic Item
class ElectronicItem extends Item {
    private int warrantyPeriod; // in months

    public ElectronicItem(String itemID, String name, double basePrice, int warrantyPeriod) {
        super(itemID, name, basePrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateTax() {
        return basePrice * 0.15; // 15% tax
    }

    @Override
    public String toString() {
        return super.toString() + ", Warranty: " + warrantyPeriod + " months";
    }
}

// Main Application
public class LogistechWarehouse {

    private static HashMap<String, Item> inventory = new HashMap<>();

    public static void addItem(Item item) {
        inventory.put(item.getItemID(), item);
        System.out.println("Item added successfully!");
    }

    public static void displayAllItems() {
        System.out.println("\n--- Warehouse Inventory ---");
        ArrayList<Item> list = new ArrayList<>(inventory.values());

        // Sort by base price
        list.sort(Comparator.comparing(Item::getBasePrice));

        for (Item item : list) {
            System.out.println(item);
        }
    }

    public static void searchItem(String id) {
        Item item = inventory.get(id);
        if (item != null) {
            System.out.println("Item Found:");
            System.out.println(item);
        } else {
            System.out.println("Item not found.");
        }
    }

    public static void calculateTotalValue() {
        double total = 0;
        for (Item item : inventory.values()) {
            total += item.getPriceWithTax();
        }
        System.out.println("\nTotal Inventory Value (Incl. Tax): $" +
                           String.format("%.2f", total));
    }

    public static void main(String[] args) {

        // Sample Inputs
        addItem(new PerishableItem("P001", "Milk", 2.50, "2026-03-10"));
        addItem(new ElectronicItem("E501", "Headphones", 120.00, 24));

        displayAllItems();

        searchItem("P001");

        calculateTotalValue();
    }
}