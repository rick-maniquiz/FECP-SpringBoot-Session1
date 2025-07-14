package org.example.Buildings;

import org.example.Animal;
import org.example.Building;
import org.example.People.Veterinarian;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hospital extends Building {

    private final ArrayList<Animal> sickAnimals = new ArrayList<>();
    private final Map<Animal, LocalDateTime> healedAnimals = new HashMap<>();
    Veterinarian veterinarian;


    public Hospital() {
        super("Zoo Hospital");
    }

    public void setVeterinarian(Veterinarian veterinarian){
        this.veterinarian = veterinarian;
    }

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
        System.out.println(veterinarian.getName() + " is giving a science lecture!");
        veterinarian.lecture();
        System.out.println("The lecture has ended. Thanks for listening!");
    }


    public void admitAnimal(Animal animal) {
        sickAnimals.add(animal);
        animal.setLocation(this);
        System.out.println(animal.getName() + " has been admitted to the Hospital.");
    }

    public void healAnimals() {
        if (sickAnimals.isEmpty()) {
            System.out.println("Hooray, there are no sick animals admitted!");
        } else {
            System.out.println(veterinarian.getName() + " is healing the animals...");
            for (Animal animal : sickAnimals) {
                veterinarian.heal(animal);
                healedAnimals.put(animal, LocalDateTime.now());
                animal.setLocation(animal.getEnclosure());
                animal.getEnclosure().animals.add(animal);
            }
            sickAnimals.clear();
        }
    }


    @Override
    public String toString() {
        return "Hospital at: " + address;
    }
}

