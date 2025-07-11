package org.example.People;

import org.example.Person;

public class Veterinarians extends Person {

    public Veterinarians(String name) {
        super(name);
        this.location = new Building ();
    }

}
