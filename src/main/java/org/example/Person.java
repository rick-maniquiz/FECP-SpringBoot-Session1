package org.example;

public abstract class Person {

    protected String name;
    protected Building location; //assuming Building is a class that represents a location
    protected String contactNumber;
    protected String email;

    public Person(String name, Building location, String contactNumber, String email) {
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
        this.email = email;
    }
}
