package org.example.People;

import org.example.Building;
import org.example.Buildings.Hospital;
import org.example.Person;

public class Veterinarian extends Person {

    public Veterinarian(String name) {
        super(name);
        this.location = new Hospital();
    }

}
