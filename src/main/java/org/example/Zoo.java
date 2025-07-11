package org.example;

import org.example.People.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.example.Ticketing;

public class Zoo {
    private final List<Visitor> visitorsWithTickets = new ArrayList<>();
    ArrayList<Building> buildings;
    private final ArrayList<Person> people = new ArrayList<>();
    ArrayList<Animal> animals;
    public boolean isZooOpen = true;


    public void addPerson(Person person) {
        this.people.add(person);
    }

    public void addVisitorWithTicket(Visitor visitor) {
        this.visitorsWithTickets.add(visitor);
    }

    public boolean isTicketCodeValid(String code) {
        return visitorsWithTickets.stream().anyMatch(v -> v.getTicketCode().equalsIgnoreCase(code));
    }

    public void setZooOpen(boolean isOpen) {
        this.isZooOpen = isOpen;
    }

    public boolean isZooOpen() {
        return isZooOpen;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Zoo Simulation!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Administrator Console");
            System.out.println("2. Buy Tickets (Visitor)");
            System.out.println("3. Exit Simulation");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    new Admin(scanner).start();
                    break;
                case "2":
                    new Ticketing(scanner).start();
                    break;
                case "3":
                    exit = true;
                    System.out.println("Thank you for using the Zoo Simulation!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }
}


