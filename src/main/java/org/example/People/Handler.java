package org.example.People;

import org.example.Building;
import org.example.Person;

public class Handler extends Person {

    public Handler(String name) {
        super(name);
        this.location = new Building(); // Assuming Building is a class that represents a location
    }

}
