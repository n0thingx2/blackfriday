package com.indev.blackfriday;

public class Item {

    private final String itemName;
    private final int itemPrice;
    private final int itemQuantity;

    public Item(String itemName, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}
