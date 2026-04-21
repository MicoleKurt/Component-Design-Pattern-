/**
 * Client Application
 * Builds the menu hierarchy and tests the Composite Design Pattern.
 */
public class RestoApp {
    public static void main(String[] args) {

        // Step 1: Create individual leaf items
        MenuItem burger   = new MenuItem("Classic Burger", 250.00);
        MenuItem fries    = new MenuItem("Large Fries", 85.00);
        MenuItem rootBeer = new MenuItem("Root Beer", 60.00);

        // Step 2: Create sub-composite and add leaves to it
        MenuCategory barkadaMeal = new MenuCategory("Barkada Solo Meal");
        barkadaMeal.add(burger);
        barkadaMeal.add(fries);
        barkadaMeal.add(rootBeer);

        // Step 3: Create another leaf item
        MenuItem sundae = new MenuItem("Vanilla Sundae", 45.00);

        // Step 4: Create top-level composite and add sub-composite + leaf
        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(barkadaMeal);
        mainMenu.add(sundae);

        // Step 5: Call print() and getPrice() on the Main Menu
        mainMenu.print();
        System.out.println();
        System.out.println("==============================");
        System.out.printf("Total Menu Value: \u20b1%.2f%n", mainMenu.getPrice());
    }
}
