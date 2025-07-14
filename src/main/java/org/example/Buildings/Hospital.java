package org.example.Buildings;

import org.example.Animal;
import org.example.Building;

import java.util.ArrayList;

public class Hospital extends Building {

    public ArrayList<Animal> admittedAnimals;


    public Hospital() {
        super("Zoo Animal Hospital");
    }

    public void admitAnimal(Animal animal) {
        admittedAnimals.add(animal);
    }

    @Override
    public String toString() {
        return "Hospital at: " + address;
    }
}
