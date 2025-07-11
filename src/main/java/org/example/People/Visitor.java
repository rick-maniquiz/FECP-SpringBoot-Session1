package org.example.People;

import org.example.Person;

import java.util.Random;

public class Visitor extends Person {

    private int age;
    private String ticketCode;
    private String ticketType;
    private double ticketPrice;

    public Visitor(String name, int age){
        super(name);
        this.age=age;
        determineTicketDetails();
        this.ticketCode=ticketCode;

    }

    private void determineTicketDetails(){
        if (age>=0 && age<=5){
            this.ticketType = "Child";
            this.ticketPrice = 0.00;
        }else if (age>=6 && age <=17){
            this.ticketType = "Student";
            this.ticketPrice = 75.00;
        }else if (age >= 18 && age<=59){
            this.ticketType="Adult";
            this.ticketPrice = 150.00;
        } else {
            this.ticketType = "Senior";
            this.ticketPrice = 50.00;
        }
    } private String generateTicketCode(){
        Random rand =  new Random();

    }
}
