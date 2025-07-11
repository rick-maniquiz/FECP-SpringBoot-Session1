package org.example.People;

import org.example.Animal;
import org.example.Building;
import org.example.Buildings.Enclosure;
import org.example.Buildings.Hospital;
import org.example.Person;

public class Handler extends Person {

    public Handler(String name, Enclosure enclosure) {
        super(name);
        this.location = enclosure; // Assuming Building is a class that represents a location
    }

    public void feed(Animal animal){
        animal.eat();
    }

    public void exercise(Animal animal){
        animal.roam();
    }

    public void examine(Animal animal, Hospital hospital){
        hospital.admitAnimal(animal);
    }
}
