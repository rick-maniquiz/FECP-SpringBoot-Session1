package org.example;

public abstract class Animal {
    protected String name, specie = "Animal Specie", type = "Animal Type";
    protected boolean isHealthy;

    protected Animal(String name, boolean isHealthy){
        this.name = name;
        this.isHealthy = isHealthy;
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

}
