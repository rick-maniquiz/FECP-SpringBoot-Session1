package org.example;

import org.example.Buildings.Enclosure;

import java.util.HashMap;
import java.util.Scanner;

public class EnclosureModule {
    HashMap<String, Enclosure> enclosures;

    EnclosureModule(HashMap<String, Enclosure> enclosures){
        this.enclosures = enclosures;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Zoo Enclosure ===");
        System.out.println("Choose Zoo Enclosure:");
        System.out.println("1. Pachyderms");
        System.out.println("2. Felines");
        System.out.println("3. Birds");

        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        while (option < 1 || option > 3){
            System.out.print("Choose a valid option: ");
            option = scanner.nextInt();
        }

        switch (option){
            case 1:{
                this.visitPachyderms();
                break;
            }
            case 2:{
                this.visitFelines();
                break;
            }
            case 3:{
                this.visitBirds();
                break;
            }
            default:{
                break;
            }
        }

    }

    private void visitPachyderms(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("There are three pachyderm enclosures.");
        System.out.print("Pick one to visit (hippo/rhino/elephant): ");
        String animalEnclosureToVisit = scanner.next();
        int option;

        while (!animalEnclosureToVisit.toLowerCase().equals("hippo")
                && !animalEnclosureToVisit.toLowerCase().equals("rhino")
                && !animalEnclosureToVisit.toLowerCase().equals("elephant")){
            System.out.print("Type a valid enclosure: ");
            animalEnclosureToVisit = scanner.next();
        }

        System.out.println("Say hello to our " + animalEnclosureToVisit.toLowerCase() + "s:");
        for (int i = 0; i < enclosures.get(animalEnclosureToVisit.toLowerCase()).animals.size(); i++){
            System.out.println((i + 1) + ". " + enclosures.get(animalEnclosureToVisit.toLowerCase()).animals.get(i).name);
        }
        System.out.print("Would you like to feed a " + animalEnclosureToVisit.toLowerCase() + " (yes/no)?");
        String willFeedThem = scanner.next();

        while (!willFeedThem.equalsIgnoreCase("yes")
                && !willFeedThem.equalsIgnoreCase("no")){
            System.out.print("Type a valid response (yes/no): ");
            willFeedThem = scanner.next();
        }

        if (willFeedThem.equals("yes")){
            System.out.print("Choose a " + animalEnclosureToVisit.toLowerCase() + " to feed:");
            option = scanner.nextInt();
            while (option < 1 || option > enclosures.get(animalEnclosureToVisit.toLowerCase()).animals.size()){
                System.out.print("Choose a valid animal: ");
                option = scanner.nextInt();
            }
            enclosures.get(animalEnclosureToVisit.toLowerCase()).animals.get(option - 1).eat();
            enclosures.get(animalEnclosureToVisit.toLowerCase()).animals.get(option - 1).makeSound();
        } else {
            enclosures.get(animalEnclosureToVisit.toLowerCase()).animals.get(0).makeSound();
        }

    }
    private void visitBirds() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There are three bird enclosures.");
        System.out.print("Pick one to visit (owl/parrot/falcon): ");
        String animalEnclosureToVisit = scanner.next();
        int option;

        while (!animalEnclosureToVisit.equalsIgnoreCase("owl")
                && !animalEnclosureToVisit.equalsIgnoreCase("parrot")
                && !animalEnclosureToVisit.equalsIgnoreCase("falcon")) {
            System.out.print("Type a valid enclosure: ");
            animalEnclosureToVisit = scanner.next();
        }

        String key = animalEnclosureToVisit.toLowerCase();
        System.out.println("Say hello to our " + key + "s:");
        for (int i = 0; i < enclosures.get(key).animals.size(); i++) {
            System.out.println((i + 1) + ". " + enclosures.get(key).animals.get(i).name);
        }

        System.out.print("Would you like to feed a " + key + " (yes/no)? ");
        String willFeedThem = scanner.next();

        while (!willFeedThem.equalsIgnoreCase("yes")
                && !willFeedThem.equalsIgnoreCase("no")){
            System.out.print("Type a valid response (yes/no): ");
            willFeedThem = scanner.next();
        }

        if (willFeedThem.equalsIgnoreCase("yes")) {
            System.out.print("Choose a " + key + " to feed: ");
            option = scanner.nextInt();
            while (option < 1 || option > enclosures.get(key).animals.size()) {
                System.out.print("Choose a valid animal: ");
                option = scanner.nextInt();
            }
            enclosures.get(key).animals.get(option - 1).eat();
            enclosures.get(key).animals.get(option - 1).makeSound();
        } else {
            enclosures.get(key).animals.get(0).makeSound();
        }
    }

    private void visitFelines() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There are three feline enclosures.");
        System.out.print("Pick one to visit (lion/tiger/cheetah): ");
        String animalEnclosureToVisit = scanner.next();
        int option;

        while (!animalEnclosureToVisit.equalsIgnoreCase("lion")
                && !animalEnclosureToVisit.equalsIgnoreCase("tiger")
                && !animalEnclosureToVisit.equalsIgnoreCase("cheetah")) {
            System.out.print("Type a valid enclosure: ");
            animalEnclosureToVisit = scanner.next();
        }

        String key = animalEnclosureToVisit.toLowerCase();
        System.out.println("Say hello to our " + key + "s:");
        for (int i = 0; i < enclosures.get(key).animals.size(); i++) {
            System.out.println((i + 1) + ". " + enclosures.get(key).animals.get(i).name);
        }

        System.out.print("Would you like to feed a " + key + " (yes/no)? ");
        String willFeedThem = scanner.next();

        while (!willFeedThem.equalsIgnoreCase("yes")
                && !willFeedThem.equalsIgnoreCase("no")){
            System.out.print("Type a valid response (yes/no): ");
            willFeedThem = scanner.next();
        }

        if (willFeedThem.equalsIgnoreCase("yes")) {
            System.out.print("Choose a " + key + " to feed: ");
            option = scanner.nextInt();
            while (option < 1 || option > enclosures.get(key).animals.size()) {
                System.out.print("Choose a valid animal: ");
                option = scanner.nextInt();
            }
            enclosures.get(key).animals.get(option - 1).eat();
            enclosures.get(key).animals.get(option - 1).makeSound();
        } else {
            enclosures.get(key).animals.get(0).makeSound();
        }
    }


}
