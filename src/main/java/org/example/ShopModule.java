package org.example;

import org.example.Buildings.Shops.*;
import org.example.People.Vendor;

import java.util.Scanner;

public class ShopModule{

    Zoo zoo;

    ShopModule(Zoo zoo){
        this.zoo = zoo;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Zoo Shop ===");
            System.out.println("Where would you like to enter:");
            System.out.println("1. Food");
            System.out.println("2. Drinks");
//            System.out.println("3. Tickets");
            System.out.println("3. Gifts");
//            System.out.println(". View Vendor Sales");
            System.out.println("0. Exit Shop");
            System.out.print("Enter shop number: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Try again: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> zoo.foodShop.startShopping();
                case 2 -> zoo.drinkShop.startShopping();
                //case 3 -> new Tickets(ticketVendor).startShopping();
                case 3 -> zoo.giftshop.startShopping();
                case 0 -> System.out.println("Leaving the zoo shop...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}