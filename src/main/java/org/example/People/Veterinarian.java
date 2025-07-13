package org.example.People;

import org.example.Building;
import org.example.Person;

public class Veterinarian extends Person {

    public Veterinarian(String name) {
        super(name);
        this.location = new Building();
    }

    public void lecture(){
        System.out.println("Please treat animals well even it is not your pet. Animals must be loved and protected!");
    }

    public void heal(){
        System.out.println("All animals are healed!");
    }

}
