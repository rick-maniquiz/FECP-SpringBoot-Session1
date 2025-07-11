package org.example.Species.Pachyderms;

import org.example.Species.Pachyderm;

public class Elephant extends Pachyderm {
    public Elephant(String name, boolean isHealthy) {
        super(name, isHealthy);
        this.type = "Elephant";
    }

    @Override
    public void makeSound(){
        System.out.println("'WOOOOOOOOOOOO!' says the " + this.type + ".");
    }
}
