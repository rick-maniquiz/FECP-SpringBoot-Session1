package org.example.Species.Felines;

import org.example.Species.Feline;

public class Lion extends Feline {
    public Lion(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.type = "Lion";
    }

    @Override
    public void makeSound(){
        System.out.println("'ROAAAAAAR!' says the " + this.type + ".");
    }
}
