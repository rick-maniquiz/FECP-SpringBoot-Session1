package org.example;

import java.util.*;

public class HospitalModule {
    Zoo zoo;

    HospitalModule(Zoo zoo){
        this.zoo = zoo;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Zoo Visitor Hospital Monitor ===");
            System.out.println("1. View Sick Animals");
            System.out.println("2. View Healed Animals");
            System.out.println("3. Attend Science Lecture");
            System.out.println("4. Heal Animals");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> zoo.getHospital().viewSickAnimals();
                case 2 -> zoo.getHospital().viewHealedAnimals();
                case 3 -> zoo.getHospital().attendScienceLecture();
                case 4 -> zoo.getHospital().healAnimals();
                case 5 -> System.out.println("Thanks for visiting!");
                default -> System.out.println("Invalid choice. Please enter a number from 1-5.");
            }
        } while (choice != 5);
    }
}
