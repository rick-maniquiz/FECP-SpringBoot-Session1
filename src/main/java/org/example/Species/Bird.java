package org.example.Species;

import org.example.Animal;
import org.example.Building;

public abstract class Bird extends Animal {
    protected Bird(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.specie = "Bird";
    }
    @Override
    public void roam(){
        System.out.println("The " + this.specie + " flies! Swooping through the wind.");
    }

}
