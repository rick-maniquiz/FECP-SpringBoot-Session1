package org.example;

public abstract class Animal {
    protected String name, specie = "Animal Specie", type = "Animal Type";
    protected boolean isHealthy;
    protected Building location;

    protected Animal(String name, boolean isHealthy, Building location){
        this.name = name;
        this.isHealthy = isHealthy;
        this.location = location;
    }

    protected void eat(){
        System.out.println("The " + this.type + " is eating!");
        this.makeSound();
    }

    protected void sleep(){
        this.makeSound();
        System.out.println("The " + this.type + " sleeps!");

    }

    protected void roam(){

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
