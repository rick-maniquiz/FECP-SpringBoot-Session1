package org.example.Buildings.Shops;


//helper class for pre-stored items per shop subclass
public class Item {
    private String itemName;
    private double price;

    public Item(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
    }

    public String getItem(){
        return this.itemName;
    }

    public double getPrice(){
        return this.price;
    }
}
