package org.example;

import java.time.LocalDateTime;
import java.util.*;
import java.time.format.DateTimeFormatter;

import org.example.People.Veterinarian;

public class VeterinarianModule {
    private final ArrayList<Animal> sickAnimals = new ArrayList<>();
    private final Map<Animal, LocalDateTime> healedAnimals = new HashMap<>();

    private final Veterinarian vet = new Veterinarian("Dr. Rick");

    public void viewSickAnimals() {
        System.out.println("--- Sick Animals Currently in Hospital ---");
        if (sickAnimals.isEmpty()) {
            System.out.println("There are currently no sick animals in the hospital!");
        } else {
            for (Animal a : sickAnimals) {
                System.out.println("- " + a.getName());
            }
        }
    }

    public void viewHealedAnimals() {
        System.out.println("--- Healed Animals with Timestamps ---");
        if (healedAnimals.isEmpty()) {
            System.out.println("No animals have been healed lately.");
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            for (Map.Entry<Animal, LocalDateTime> entry : healedAnimals.entrySet()) {
                System.out.printf(" %s (Healed at: %s)%n",
                        entry.getKey().getName(),
                        entry.getValue().format(formatter));
            }
        }
    }

    public void attendScienceLecture() {
        System.out.println(vet.getName() + " is giving a science lecture!");
        vet.lecture();
        System.out.println("The lecture has ended. Thanks for listening!");
    }

    public void healAnimals() {
        if (sickAnimals.isEmpty()) {
            System.out.println("Hooray, there are no sick animals admitted!");
        } else {
            System.out.println(vet.getName() + " is healing the animals...");
            for (Animal animal : sickAnimals) {
                vet.heal(animal);
                healedAnimals.put(animal, LocalDateTime.now());
            }
            sickAnimals.clear();
        }
    }

    public void admitAnimal(Animal animal) {
        sickAnimals.add(animal);
        System.out.println(animal.getName() + " has been admitted to the Hospital.");
    }

//    public List<Animal> getSickAnimals() {
//        return sickAnimals;
//    }
//
//    public Map<Animal, LocalDateTime> getHealedAnimals() {
//        return healedAnimals;
//    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Zoo Visitor Hospital Monitor ===");
            System.out.println("1. View Sick Animals");
            System.out.println("2. View Healed Animals");
            System.out.println("3. Attend Science Lecture");
            System.out.println("4. Heal Animals");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> viewSickAnimals();
                case 2 -> viewHealedAnimals();
                case 3 -> attendScienceLecture();
                case 4 -> healAnimals();
                case 5 -> System.out.println("Thanks for visiting!");
                default -> System.out.println("Invalid choice. Please enter a number from 1-5.");
            }
        } while (choice != 5);
    }
}
