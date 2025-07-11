package org.example.Species.Birds;

import org.example.Species.Bird;

public class Parrot extends Bird {
    public Parrot(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.type = "Parrot";
    }
    @Override
    public void makeSound(){
        System.out.println("'Hello World!' says the " + this.type + ".");
    }
}
