package com.company;

public class Main {

    public static void main(String[] args) {
	    GroceryList groceryList = new GroceryList();
	    groceryList.addGroceryItem("burgers");
	    groceryList.printGroceryList();
	    groceryList.addGroceryItem("tomatos");
	    groceryList.addGroceryItem("candy");
	    groceryList.addGroceryItem("pickles");
	    groceryList.printGroceryList();
    }
}
