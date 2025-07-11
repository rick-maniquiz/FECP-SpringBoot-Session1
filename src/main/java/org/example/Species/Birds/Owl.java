package org.example.Species.Birds;

import org.example.Species.Bird;

public class Owl extends Bird {

    public Owl(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.type = "Owl";
    }

    @Override
    public void makeSound(){
        System.out.println("'HOOT HOOT!' says the " + this.type + ".");
    }

}
