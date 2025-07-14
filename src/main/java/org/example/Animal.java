package org.example;

import org.example.Buildings.Enclosure;

import org.example.Species.Bird;

import java.util.ArrayList;

public abstract class Animal {
    protected String name, specie = "Animal Specie", type = "Animal Type";
    protected Building location;
    protected Enclosure enclosure;
    protected boolean isHealthy;

    protected Animal(String name, boolean isHealthy){
        this.name = name;
        this.isHealthy = isHealthy;

    }

    public String getType(){
        return this.type;
    }

    public void eat(){
        System.out.println(this.name + " the " + this.type + " is eating!");
//        this.makeSound();
    }

    protected void sleep(){
//        this.makeSound();
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

    public void setLocation(Building building){
        this.location = building;
    }

    public void setEnclosure(Enclosure enclosure){
        this.enclosure = enclosure;
    }

    public Enclosure getEnclosure(){
        return this.enclosure;
    }

    public void setHealth(boolean bool){
        this.isHealthy = bool;
    }

}
