package org.example.Buildings;

import org.example.Building;
public class Hospital extends Building {

    public Hospital() {
        super("Zoo Animal Hospital");
    }

    @Override
    public String toString() {
        return "Hospital at: " + address;
    }
}
