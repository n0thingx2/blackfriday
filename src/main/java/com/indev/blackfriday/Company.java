package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class Company {

    private Map<String, Item> availableItems = new HashMap<String, Item>();
    private int totalAssets ;

    public float sells(String soldeItem) {
        Item itemToSell = availableItems.get(soldeItem);
        float salePrice = itemToSell.sell();
        salePrice += calculatePriceMargin(salePrice);
        addTotalAssets(salePrice);
        return salePrice;
    }

    private void addTotalAssets(float salePrice) {
        totalAssets += salePrice;
    }

    private float calculatePriceMargin(float salePrice){
        return salePrice * 0.2F;
    }

    public void stock(int itemQuantity, String itemName, int itemPrice) {
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
        totalAssets += availableItems.values().stream()
                .mapToInt(item -> item.getItemPrice() * item.getItemQuantity())
                .sum();
        return totalAssets;
    }

    public Company blackFriday() {
        return this;
    }
}
