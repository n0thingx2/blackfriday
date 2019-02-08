package com.indev.blackfriday;

public class Item {

    private final String itemName;
    private int itemPrice;
    private int itemQuantity;

    public Item(String itemName, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public float sell(){
        this.itemQuantity -= 5;
        return 5 * itemPrice;
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
