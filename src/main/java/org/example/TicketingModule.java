package org.example;

import org.example.People.Visitor;

import java.util.Scanner;

public class TicketingModule {

    private final Scanner scanner = new Scanner(System.in);
    private final Zoo zoo;

    public TicketingModule(Zoo zoo) {
        this.zoo = zoo;
    }

    public void run(){
//        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== WELCOME TO THE ZOO TICKET SHOP ===");
        if (!zoo.isZooOpen()) {
            System.out.println("Sorry, the Zoo is currently closed. Please come back later.");
            return;
        }
        System.out.println("Here's what you can experience in the zoo:");
        System.out.println("Visit Animal Enclosures (Elephant, Lion, Owl)");
        System.out.println("Buy snacks and drinks from our Shops");
        System.out.println("Listen to science lectures at the Hospital");
        System.out.println("Buy fun gifts at our Gift Shop");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");

        String ageInput = scanner.nextLine();
        int age;

        if (ageInput.matches("\\d+")) {
            age = Integer.parseInt(ageInput);
        } else {
            System.out.println("Invalid age. Please enter a number.");
            return;
        }
        if (age < 0) {
            System.out.println("Age cannot be negative. Please enter a valid age.");
            return;
        }

        Visitor newVisitor = new Visitor(name, age);
        System.out.println("\nYou qualify for a " + newVisitor.getTicketType().toUpperCase() + " ticket.");
        System.out.printf("Ticket Price: ₱%.2f\n", newVisitor.getTicketPrice());

        System.out.print("Proceed with purchase? (yes/no) ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            // Adds the visitor's ticket to the central Zoo system for validation
            zoo.addVisitorWithTicket(newVisitor);
            System.out.println("\nTicket purchased!");
            System.out.println("Your ticket code is: " + newVisitor.getTicketCode());
            System.out.println("[Ticket added to system]");
            validateEntry();
        } else {
            System.out.println("Purchase cancelled.");
        }


    }
    private void validateEntry() {
        System.out.println("\n=== 🎟️ Visitor Entry ===");
        System.out.print("Enter your ticket code: ");
        String code = scanner.nextLine();

        if (zoo.isTicketCodeValid(code)) {
            System.out.println("Welcome to the Zoo! Enjoy your visit.");
        } else {
            System.out.println("Invalid ticket code. Please purchase a ticket to enter.");
        }
    }

    }

