package org.example.Buildings;

import org.example.Animal;
import org.example.Building;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Enclosure extends Building {

    public ArrayList<Animal> animals;
    public String enclosureType = "Generic";

    public void setAnimals(ArrayList<Animal> animals){
        this.animals = animals;
    }
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
    public void openEnclosure(){

    }

    public void EnclosureMenu() {

    }



}
