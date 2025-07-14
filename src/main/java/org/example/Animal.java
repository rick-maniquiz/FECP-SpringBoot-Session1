package org.example;

import org.example.Buildings.Enclosure;

public abstract class Animal {
    protected String name, specie = "Animal Specie", type = "Animal Type";
    protected Building location;
    protected Enclosure enclosure;
    protected boolean isHealthy;

    protected Animal(String name, boolean isHealthy, Building location, Enclosure enclosure){
        this.name = name;
        this.isHealthy = isHealthy;
        this.location = location;
        this.enclosure = enclosure;
    }

    public void eat(){
        System.out.println("The " + this.type + " is eating!");
        this.makeSound();
    }

    protected void sleep(){
        this.makeSound();
        System.out.println("The " + this.type + " sleeps!");

    }

    public void roam(){

    }

    protected void makeSound(){

    }

    //added for veterinarian module
    public String getName() {
        return name;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

}
