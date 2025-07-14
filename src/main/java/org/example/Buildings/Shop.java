package org.example.Buildings;

import org.example.Building;
import org.example.Buildings.Shops.Item;
import org.example.People.Vendor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Shop extends Building {
    protected List<Item> itemList = new ArrayList<>();
    protected List<Item> cart = new ArrayList<>();
    protected Scanner scanner = new Scanner(System.in);
    protected Vendor vendor;

    public Shop(Vendor vendor) {
        super("Zoo Shop");
        this.vendor = vendor;
        populateItems();
    }

    protected abstract void populateItems();
    protected abstract String getShopName();

    public void startShopping() {
        cart.clear();
        System.out.println("Welcome to the " + getShopName() + "!");

        boolean shopping = true;
        while (shopping) {
            System.out.println("\nAvailable Products:");
            for (int i = 0; i < itemList.size(); i++) {
                Item item = itemList.get(i);
                System.out.printf("%d. %s - ₱%.2f%n", i + 1, item.getItem(), item.getPrice());
            }
            System.out.println("0. Proceed to Checkout");
            System.out.print("Enter item number: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                shopping = false;
                checkout();
            } else if (choice > 0 && choice <= itemList.size()) {
                Item selected = itemList.get(choice - 1);
                cart.add(selected);
                System.out.println(selected.getItem() + " added to cart.");
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. No purchase made.");
            return;
        }

        double total = 0;
        System.out.println("\nYour cart");
        for (Item item : cart) {
            System.out.printf("- %s: ₱%.2f%n", item.getItem(), item.getPrice());
            total += item.getPrice();
            vendor.sell(item);
        }

        System.out.printf("Total paid: ₱%.2f%n", total);

        System.out.println("Would you like to checkout (yes/no)? ");
        if (scanner.next().toLowerCase().equals("no")){
            System.out.println("Thank you for stopping by!");
            return;
        }

        System.out.println("\nReceipt:");
        for (Item item : cart) {
            System.out.printf("- %s: ₱%.2f%n", item.getItem(), item.getPrice());
            total += item.getPrice();
            vendor.sell(item);
        }

        System.out.printf("Total paid: ₱%.2f%n", total);
        System.out.println("Payment successful! Thank you for paying thru GCash!\n");
    }
}