package org.example.Species.Birds;

import org.example.Species.Bird;

public class Falcon extends Bird {
    public Falcon(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.type = "Falcon";
    }

    @Override
    public void makeSound(){
        System.out.println("'RAAAAAAAAAHHHHHHHHHH!' says the " + this.type + ".");
    }
}
