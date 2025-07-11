package org.example.Species.Felines;

import org.example.Species.Feline;

public class Cheetah extends Feline {

    public Cheetah(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.type = "Cheetah";
    }

    @Override
    public void makeSound(){
        System.out.println("'MEOW' says the " + this.type + ".");
    }
}
