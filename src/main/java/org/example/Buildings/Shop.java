package org.example.Buildings;

import java.util.ArrayList;
import java.util.List;
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
        boolean willContinue = true;

        while (willContinue){
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
            System.out.println();
        }
    }


}
