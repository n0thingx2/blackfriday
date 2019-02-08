package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {

    Map<String, Item> availableItems = new HashMap<String, Item>();

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int itemPrice, String itemName, int itemQuantity) {
        Item item = new Item(itemName, itemPrice, itemQuantity);
        availableItems.put(itemName, item);
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
//        return 20;
        return availableItems.values().stream()
                .mapToInt(item -> item.getItemPrice() * item.getItemQuantity())
                .sum();
    }

    public Company blackFriday() {
        return this;
    }
}
