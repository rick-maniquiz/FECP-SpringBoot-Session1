package org.example.Species.Pachyderms;

import org.example.Species.Pachyderm;

public class Rhino extends Pachyderm {
    public Rhino(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.type = "Rhino";
    }

    @Override
    public void makeSound(){
        System.out.println("'RAAAAAAR' says the " + this.type + ".");
    }
}
