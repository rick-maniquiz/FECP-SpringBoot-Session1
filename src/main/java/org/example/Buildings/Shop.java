package org.example.Buildings;

import java.util.ArrayList;
import java.util.Lists;
import java.util.Scanner;

import org.example.Buildings.Shops.Item;

public abstract class Shop {

    private List<Item> itemList = new ArrayList<>();
    private List<Item> cart = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public Shop(){
        populateItems();
    }

    protected abstract void populateItems();

    public void startShop(){
        clearCart();
        boolean continue = true;

        while (continue){
            showItems();
            System.out.println("Enter item number to add to cart (0 to proceed to checkout):");
            int menuChoice = scanner.nextInt();

            if (menuChoice==0){

            }
        }
    }

    public void clearCart(){
        cart.clear();
    }

    private void showItems(){
        System.out.println("---Available Items---");
        for (int i=0; i<itemList.size(); i++) {
            Item item = itemList.get(i);
            System.out.println("-",i+1, item.getItem(), item.getPrice());
        }
    }


}
