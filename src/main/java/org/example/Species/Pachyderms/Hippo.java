package org.example.Species.Pachyderms;

import org.example.Species.Pachyderm;

public class Hippo extends Pachyderm {

    public Hippo(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.type = "Hippo";
    }

    @Override
    public void makeSound(){
        System.out.println("'ROOOR' says the " + this.type + ".");
    }
}
