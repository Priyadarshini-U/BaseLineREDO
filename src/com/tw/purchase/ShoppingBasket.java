package com.tw.purchase;

import java.util.HashMap;

public class ShoppingBasket {

    HashMap<Good, Integer> items;

    public ShoppingBasket() {
        items = new HashMap<Good, Integer>();
    }

    public double totalTax() {
        return 0;

    }
    public void addToBasket(Good good, int quantity) {
        this.items.put(good, quantity);
    }


}
