package org.example;

import org.example.People.Manager;
import org.example.People.Veterinarian;
import org.example.People.Handler;
import org.example.People.Vendor;
import org.example.People.Visitor;

import java.util.Scanner;

public class Admin {

    private final Scanner scanner;
    private final Zoo zoo = new Zoo();

    public Admin(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("\n=== Welcome to the Zoo Admin Console ===");
        if (login()) {
            showAdminMenu();
        } else {
            System.out.println("Login failed. Returning to main menu.");
        }
    }

    private boolean login() {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();

        if ("admin".equals(username) && "admin".equals(password)) {
            System.out.println("Login successful. Welcome!");
            return true;
        }
        return false;
    }

    private boolean showAdminMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n========== 🦁 ZOO ADMIN MAIN MENU ==========");
            System.out.println("1. Setup Zoo Staff");
            System.out.println("2. Access Handler Module");
            System.out.println("3. Open Zoo to Visitors");
            System.out.println("4. Close Zoo to Visitors");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    setupStaff();
                    break;
                case "2":
                    System.out.println("[Handler Module not yet implemented.]");
                    break;
                case "3":
                    zoo.setZooOpen(true);
                    System.out.println("The Zoo is now open to visitors.");
                    break;
                case "4":
                    zoo.setZooOpen(false);
                    System.out.println("The Zoo is now closed to visitors.");
                    break;
                case "5":
                    exit = true;
                    System.out.println("Exiting Admin Console.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        return exit;
    }

        private void setupStaff() {
            System.out.println("\n--- Zoo Setup ---");
            System.out.print("Enter your name, Manager: ");
            zoo.addPerson(new Manager(scanner.nextLine()));
            System.out.print("Enter Veterinarian's name: ");
            zoo.addPerson(new Veterinarian(scanner.nextLine()));
            System.out.print("Enter Handler for Pachyderm Enclosure: ");
            zoo.addPerson(new Handler(scanner.nextLine()));
            System.out.print("Enter Handler for Feline Enclosure: ");
            zoo.addPerson(new Handler(scanner.nextLine()));
            System.out.print("Enter Handler for Bird Enclosure: ");
            zoo.addPerson(new Handler(scanner.nextLine()));
            System.out.print("Enter Vendor for Ticket Shop: ");
            zoo.addPerson(new Vendor(scanner.nextLine(), new Building("Ticket Shop")));
            System.out.print("Enter Vendor for Shop: ");
            zoo.addPerson(new Vendor(scanner.nextLine(), new Building("Gift Shop")));
            System.out.println("\nZoo staff setup complete.");

        }
    }



