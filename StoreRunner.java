import java.util.Scanner;
public class StoreRunner {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create beverages
        Beverage latte = new Beverage(
            "Iced Latte", 101, 4.50, 20,
            "Large", "Cold"
        );

        Beverage coffee = new Beverage(
            "Hot Coffee", 102, 2.75, 30,
            "Medium", "Hot"
        );

        // Create pastries
        Pastry cookie = new Pastry(
            "Chocolate Chip Cookie", 201, 2.00, 25,
            "Cookie", false
        );

        Pastry croissant = new Pastry(
            "Butter Croissant", 202, 3.25, 12,
            "Croissant", false
        );

        System.out.println("[------------------------------]");
        System.out.println("   Lenny's CAFE Place ");
        System.out.println("[------------------------------]");

        System.out.println("Greeting's people!!!!!");
        System.out.println("1. View menu");
        System.out.println("2. check stock");
        System.out.println("3. Update drink quantity");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("\n--- CAFE MENU ---");
            System.out.println(latte);
            System.out.println(coffee);
            System.out.println(cookie);
            System.out.println(croissant);

        } else if (choice == 2) {
            System.out.println("\n--- INVENTORY ---");
            System.out.println(latte);
            System.out.println(coffee);
            System.out.println(cookie);
            System.out.println(croissant);

        } else if (choice == 3) {
            System.out.print("Enter the new latte quantity: ");
            int quantity = input.nextInt();

            latte.setQuantityAvailable(quantity);

            System.out.println("Inventory updated!");
            System.out.println(latte);

        } else if (choice == 4) {
            System.out.println("Come back soon ;) ;) ;) ;) ;) ;) ;) ;) ;) ;) ;) ");

        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        // Close the Scanner object
        input.close();
    }
}
