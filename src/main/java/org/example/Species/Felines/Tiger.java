package org.example.Species.Felines;

import org.example.Species.Feline;

public class Tiger extends Feline {
    public Tiger(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.type = "Tiger";
    }

    @Override
    public void makeSound(){
        System.out.println("'RAWR RAWRRR!' says the " + this.type + ".");
    }
}
