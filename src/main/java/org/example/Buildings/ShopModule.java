package org.example.Buildings;

import org.example.Buildings.Shops.*;
import org.example.People.Vendor;

import java.util.Scanner;

public class ShopModule {
    private Scanner scanner = new Scanner(System.in);

    private Vendor foodVendor = new Vendor("Mr. Lebron", "Food");
    private Vendor drinksVendor = new Vendor("Mr. Curry", "Drinks");
    //private Vendor ticketVendor = new Vendor("Ms. Kaye", "Tickets");
    private Vendor giftVendor = new Vendor("Ms. Red", "Gifts");

    public void start() {
        int choice;

        do {
            System.out.println("\n=== Zoo Shop ===");
            System.out.println("Where would you like to enter:");
            System.out.println("1. Food");
            System.out.println("2. Drinks");
            System.out.println("3. Tickets");
            System.out.println("4. Gifts");
            System.out.println("5. View Vendor Sales");
            System.out.println("0. Exit Shop");
            System.out.print("Enter shop number: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Try again: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> new Food(foodVendor).startShopping();
                case 2 -> new Drinks(drinksVendor).startShopping();
                //case 3 -> new Tickets(ticketVendor).startShopping();
                case 4 -> new Gifts(giftVendor).startShopping();
                case 0 -> System.out.println("Leaving the zoo shop...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}