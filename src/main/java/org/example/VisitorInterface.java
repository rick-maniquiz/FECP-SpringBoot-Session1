package org.example;

import java.util.Scanner;

public class VisitorInterface {
    Zoo zoo;
    VisitorInterface(Zoo zoo){
        this.zoo = zoo;
    }
    public void runInterface(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Welcome to the Zoo Simulation ===");
            System.out.println("1. Enter Hospital Monitor");
            System.out.println("2. Enter Zoo Shop");
            System.out.println("3. Visit an Enclosure");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> new HospitalModule(zoo).run();
                case 2 -> new ShopModule(zoo).run();
                case 3 -> new EnclosureModule(zoo).run();
                case 4 -> System.out.println("Exiting zoo simulation...");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

}

