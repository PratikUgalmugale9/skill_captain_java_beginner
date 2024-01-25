import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class GroceryItem {
    private String name;
    private int quantity;

    public GroceryItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public String toString() {
        if (quantity > 0) {
            return name + " (Quantity: " + quantity + ")";
        } else {
            return name;
        }
    }
}
public class GroceryListManager {
    private ArrayList<GroceryItem> groceryList;
    public GroceryListManager() {
        groceryList = new ArrayList<>();
    }
    public void addItem(String name, int quantity) {
        groceryList.add(new GroceryItem(name, quantity));
    }
    public void removeItem(String name) {
        Iterator<GroceryItem> iterator = groceryList.iterator();
        while (iterator.hasNext()) {
            GroceryItem item = iterator.next();
            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }
    }
    public void printList() {
        if (groceryList.isEmpty()) {
            System.out.println("Grocery List is empty.");
        } else {
            System.out.println("Current Grocery List:");
            for (GroceryItem item : groceryList) {
                System.out.println(item);
            }
        }
    }
    public boolean containsItem(String name) {
        for (GroceryItem item : groceryList) {
            if (item.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    public void clearList() {
        groceryList.clear();
    }
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Item to Grocery List");
            System.out.println("2. Remove Item from Grocery List");
            System.out.println("3. Print Grocery List");
            System.out.println("4. Check if Item is on Grocery List");
            System.out.println("5. Clear Grocery List");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item quantity (if any): ");
                    int itemQuantity = scanner.nextInt();
                    manager.addItem(itemName, itemQuantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = scanner.nextLine();
                    manager.removeItem(itemToRemove);
                    break;
                case 3:
                    manager.printList();
                    break;
                case 4:
                    System.out.print("Enter item name to check: ");
                    String itemToCheck = scanner.nextLine();
                    if (manager.containsItem(itemToCheck)) {
                        System.out.println(itemToCheck + " is on the Grocery List.");
                    } else {
                        System.out.println(itemToCheck + " is not on the Grocery List.");
                    }
                    break;
                case 5:
                    manager.clearList();
                    System.out.println("Grocery List cleared.");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}