package org.example;

import org.example.People.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.example.Ticketing;

public class Zoo {
    private final List<Visitor> visitorsWithTickets = new ArrayList<>();
    ArrayList<Building> buildings;
    ArrayList<Person> persons;
    ArrayList<Animal> animals;
    public boolean isZooOpen = true;


    // This method needs to be public to be called from other modules
    public void addVisitorWithTicket(Visitor visitor) {
        this.visitorsWithTickets.add(visitor);
    }

    // This method needs to be public to be called from other modules
    public boolean isTicketCodeValid(String code) {
        return visitorsWithTickets.stream().anyMatch(v -> v.getTicketCode().equalsIgnoreCase(code));
    }

    public boolean isZooOpen() {
        return isZooOpen;
    }

    public static void main(String[] args) {

        // You can add more functionality here to test the Zoo class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Zoo Simulation!");

        boolean exit = false;
        // This loop runs the main menu until the user chooses to exit.
        while (!exit) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Administrator Console");
            System.out.println("2. Buy Tickets (Visitor)");
            System.out.println("3. Exit Simulation");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    new Ticketing(scanner).start();
                    break;
                case "2":
                    exit = true;
                    System.out.println("Thank you for using the Zoo Simulation!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }
}
