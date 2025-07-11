package org.example;

public abstract class Person {

    protected String name;
    protected Building location; //assuming Building is a class that represents a location
    protected String contactNumber;
    protected String email;

    public Person (String name){
        this.name = name;
        this.location = null; // Initially, the person has no location
        this.contactNumber = "";
        this.email = "";
    }
    public void goTo(Building destination){
        System.out.println(name + " is going to " + destination);
        this.location = destination;
    }

    public String getName() {
        return name;
    }
    public Building getLocation() {
        return location;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }


}
