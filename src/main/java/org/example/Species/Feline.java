package org.example.Species;

import org.example.Animal;

public class Feline extends Animal {
    protected Feline(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.specie = "Feline";
    }

    @Override
    protected void roam(){
        System.out.println("The " + this.specie + " dashes! Zooming through the field.");
    }

}
