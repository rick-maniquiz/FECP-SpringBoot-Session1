package org.example;

public class Building {
    protected String address;

    public Building() {
        this.address = "Unknown";
    }

    public Building(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return address;
    }
}
