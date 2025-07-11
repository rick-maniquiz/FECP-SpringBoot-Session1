package org.example.Species.Pachyderms;

import org.example.Species.Pachyderm;

public class Hippo extends Pachyderm {

    public Hippo(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.type = "Hippo";
    }

    @Override
    public void makeSound(){
        System.out.println("'ROOOR' says the " + this.type + ".");
    }
}
