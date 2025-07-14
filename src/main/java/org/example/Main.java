package org.example;

import org.example.Buildings.Enclosure;
import org.example.Buildings.Enclosures.SetupEnclosures;
import org.example.Buildings.Hospital;
import org.example.People.Handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        SetupEnclosures setupEnclosures = new SetupEnclosures();
        zoo.setEnclosures(setupEnclosures.setupAllEnclosure());
        zoo.setHospital(new Hospital());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Zoo Simulation!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Administrator Console");
//            System.out.println("2. Handler Console");
            System.out.println("2. Buy Tickets (Visitor)");
            System.out.println("3. Exit Simulation");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:{
                    new AdminModule(zoo).run();
                    break;
                }

                case 2:{
                    new TicketingModule(zoo).run();
                    break;
                }

                case 3:{
                    exit = true;
                    System.out.println("Thank you for using the Zoo Simulation!");
                    break;
                }

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }

    }
}
