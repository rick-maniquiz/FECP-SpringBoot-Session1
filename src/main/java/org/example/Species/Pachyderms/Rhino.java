package org.example.Species.Pachyderms;

import org.example.Species.Pachyderm;

public class Rhino extends Pachyderm {
    public Rhino(String name, boolean isHealthy, Building location) {
        super(name, isHealthy, location);
        this.type = "Rhino";
    }

    @Override
    public void makeSound(){
        System.out.println("'RAAAAAAR' says the " + this.type + ".");
    }
}
