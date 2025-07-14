package org.example.Buildings.Shops;

import org.example.Buildings.Shop;
import org.example.People.Vendor;

public class Food extends Shop {
    public Food(Vendor vendor) {
        super(vendor);
    }

    @Override
    protected void populateItems() {
        itemList.add(new Item("Popcorn", 50));
        itemList.add(new Item("Siomai Rice", 100));
        itemList.add(new Item("Burger", 80));
    }

    @Override
    protected String getShopName() {
        return "Food Stall";
    }
}