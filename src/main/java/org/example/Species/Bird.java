package org.example.Species;

import org.example.Animal;

public class Bird extends Animal {
    protected Bird(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.specie = "Bird";
    }
    @Override
    protected void roam(){
        System.out.println("The " + this.specie + " flies! Swooping through the wind.");
    }

}
