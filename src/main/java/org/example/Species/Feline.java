package org.example.Species;

import org.example.Animal;
import org.example.Building;

public abstract class Feline extends Animal {
    protected Feline(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.specie = "Feline";
    }

    @Override
    protected void roam(){
        System.out.println("The " + this.specie + " dashes! Zooming through the field.");
    }

}
