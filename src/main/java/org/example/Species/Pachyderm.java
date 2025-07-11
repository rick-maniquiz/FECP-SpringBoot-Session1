package org.example.Species;

import org.example.Animal;

public abstract class Pachyderm extends Animal {
    protected Pachyderm(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.specie = "Pachyderm";
    }

    @Override
    protected void roam(){
        System.out.println("The " + this.specie + " runs! Stomping through the ground.");
    }

}
