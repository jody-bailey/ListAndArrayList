package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (String grocery: groceryList) {
            System.out.println(grocery);
        }
    }

    public void modifyGroceryList(int position, String item) {
        groceryList.set(position, item);
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

}
