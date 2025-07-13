package org.example.People;

import org.example.Person;

import java.util.Random;

public class Visitor extends Person {

    private final int age;
    private final String ticketCode;
    private final String ticketType;
    private final double ticketPrice;

    public Visitor(String name, int age){
        super(name);
        this.age=age;
        this.ticketType = determineTicketType();
        this.ticketPrice = determineTicketPrice();
        this.ticketCode = generateTicketCode();

    }

    private String determineTicketType() {
        if (age >= 0 && age <= 5) return "Child";
        if (age >= 6 && age <= 17) return "Student";
        if (age >= 18 && age <= 59) return "Adult";
        return "Senior";
    }

    private double determineTicketPrice() {
        if (age >= 0 && age <= 5) return 0.00;
        if (age >= 6 && age <= 17) return 75.00;
        if (age >= 18 && age <= 59) return 150.00;
        return 50.00;
    }

    private String generateTicketCode() {
        return "ZOO-" + (1000 + new Random().nextInt(9000));
    }

    // Getters are needed for the module to display ticket info
    public String getTicketCode() {
        return ticketCode;
    }
    public String getTicketType() {
        return ticketType;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
}

