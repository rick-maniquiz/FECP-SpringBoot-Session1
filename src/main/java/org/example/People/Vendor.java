package org.example.People;

import org.example.Person;
import org.example.Buildings.Shops.Item;

public class Vendor extends Person {
    private String vendorType;
    private double revenue;

    public Vendor(String name, String vendorType) {
        super(name);
        this.vendorType = vendorType;
        this.revenue = 0.0;
    }

    public void sell(Item item) {
        revenue += item.getPrice();
        System.out.println(name + " (Vendor of " + vendorType + ") sold: " + item.getItem());
    }

    public double getRevenue() {
        return revenue;
    }

    public String getVendorType() {
        return vendorType;
    }
}