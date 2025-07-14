package org.example.Buildings.Shops;

import org.example.Buildings.Shop;
import org.example.People.Vendor;

public class Drinks extends Shop {
    public Drinks(Vendor vendor) {
        super(vendor);
    }

    @Override
    protected void populateItems() {
        itemList.add(new Item("Water", 20));
        itemList.add(new Item("Soda", 40));
        itemList.add(new Item("Iced Tea", 45));
    }

    @Override
    protected String getShopName() {
        return "Drinks Stall";
    }
}