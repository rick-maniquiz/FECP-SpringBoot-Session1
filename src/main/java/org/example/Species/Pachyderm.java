package org.example.Species;

import org.example.Animal;

public abstract class Pachyderm extends Animal {
    protected Pachyderm(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.specie = "Pachyderm";
    }

    @Override
    public void roam(){
        System.out.println("The " + this.specie + " runs! Stomping through the ground.");
    }

}
