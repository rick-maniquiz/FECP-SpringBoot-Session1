package org.example;

import org.example.People.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ticketing {

    private final Scanner scanner;
    private final Zoo zoo = new Zoo();

    public Ticketing(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start(){
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
        int age;

        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
            scanner.nextLine();
            if (age < 0) {
                System.out.println("Age cannot be negative. Please enter a valid age.");
                return;
            }
        } else {
            System.out.println("Invalid age. Please enter a number.");
            scanner.nextLine();
            return;
        }

        Visitor newVisitor = new Visitor(name, age);
        System.out.println("\nYou qualify for a/an " + newVisitor.getTicketType().toUpperCase() + " ticket.");
        System.out.printf("Ticket Price: ₱%.2f\n", newVisitor.getTicketPrice());

        System.out.print("Proceed with purchase? (yes/no) ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
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

