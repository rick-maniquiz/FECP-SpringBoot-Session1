package org.example.People;

import org.example.Building;
import org.example.Buildings.Hospital;
import org.example.Person;

public class Veterinarian extends Person {

    public Veterinarian(String name, Hospital hospital) {
        super(name);
        this.location = hospital;
    }

}
