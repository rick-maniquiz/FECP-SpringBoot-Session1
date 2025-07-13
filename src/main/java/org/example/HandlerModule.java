package org.example;

import org.example.Buildings.Enclosure;
import org.example.Buildings.Hospital;
import org.example.People.Handler;

import java.util.ArrayList;
import java.util.Scanner;

public class HandlerModule {
//    ArrayList<Building> buildings;
    ArrayList<Handler> handlers;
    Hospital hospital;
//    ArrayList<Animal> animals;
    Handler handlerLoggedIn;
    Animal animalToHandle;
    Scanner scanner = new Scanner(System.in);
    int response = -1;

    HandlerModule(ArrayList<Handler> handlers, Hospital hospital){
//        this.buildings = buildings;
        this.handlers = handlers;
        this.hospital = hospital;
//        this.animals = animals;
    }

    public void run(){
        System.out.print("Enter your name (Handler): ");
        String handlerName = scanner.next();
        for (Handler handler: handlers){
            if (handler.getName().equals(handlerName)){
                handlerLoggedIn = handler;
            }
        }
        if (handlerLoggedIn == null){
            System.out.println(handlerName + " is not a handler in this zoo!");
            return;
        }
        System.out.println("Welcome, Handler "+ handlerName + "!");
        System.out.println("--- Animal Duty Menu ---");
        System.out.println("Animals assigned to you:");
        for (int i = 0; i < handlerLoggedIn.getEnclosure().animals.size(); i++){
            System.out.println((i + 1) + ". " + handlerLoggedIn.getEnclosure().animals.get(i).name);
        }
        System.out.print("Choose animal to interact with (0 to exit): ");
        this.response = scanner.nextInt();
        int serviceChoice;
        Animal animalChoice;

        while (true){
            if (this.response == 0){
                break;
            }
            if(this.response < 0 || this.response > handlerLoggedIn.getEnclosure().animals.size()){
                System.out.println("Choose a valid animal!");
            } else {
                animalChoice = handlerLoggedIn.getEnclosure().animals.get(this.response-1);
                System.out.println("Choose action:");
                System.out.println("1. Feed " + animalChoice.name);
                System.out.println("2. Exercise " + animalChoice.name);
                System.out.println("3. Examine " + animalChoice.name + " to vet.");
                System.out.print("Choose an option: ");
                serviceChoice = scanner.nextInt();
                switch (serviceChoice){
                    case 1:{
                        animalChoice.eat();
                        break;
                    }
                    case 2:{
                        animalChoice.roam();
                        break;
                    }
                    case 3:{
                        this.hospital.admitAnimal(animalChoice);
                        break;
                    }
                    default:{
                        System.out.println("Invalid action!");
                        break;
                    }
                }
            }
            System.out.print("Choose animal: ");
            this.response = scanner.nextInt();


        }
    }
}
