package org.example.Buildings.Shops;

import org.example.Buildings.Shop;
import org.example.People.Vendor;

public class Gifts extends Shop {
    public Gifts(Vendor vendor) {
        super(vendor);
    }

    @Override
    protected void populateItems() {
        itemList.add(new Item("Zoo Keychain", 40));
        itemList.add(new Item("Plushie", 150));
        itemList.add(new Item("Zoo T-Shirt", 200));
    }

    @Override
    protected String getShopName() {
        return "Gift Shop";
    }
}