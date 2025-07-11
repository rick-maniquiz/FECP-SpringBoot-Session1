package org.example.Species.Birds;

import org.example.Species.Bird;

public class Falcon extends Bird {
    public Falcon(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.type = "Falcon";
    }

    @Override
    public void makeSound(){
        System.out.println("'RAAAAAAAAAHHHHHHHHHH!' says the " + this.type + ".");
    }
}
