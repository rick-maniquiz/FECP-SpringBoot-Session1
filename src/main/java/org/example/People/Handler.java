package org.example.People;

import org.example.Building;
import org.example.Buildings.Enclosure;
import org.example.Person;

public class Handler extends Person {

    public Handler(String name, Enclosure enclosure) {
        super(name);
        this.location = enclosure; // Assuming Building is a class that represents a location
    }

}
