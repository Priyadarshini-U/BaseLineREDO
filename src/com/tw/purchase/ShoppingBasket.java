package com.tw.purchase;

import java.util.HashMap;

public class ShoppingBasket {

    HashMap<Good, Integer> items;

    public ShoppingBasket() {
        items = new HashMap<Good, Integer>();
    }

    public double totalTax() {
        double tax = 0;
        for( Good item: items.keySet()){
            tax += items.get(item) * item.calculateTax(item.totalTaxPercentage()) ;
        }
        return tax;

    }
    public void addToBasket(Good good, int quantity) {
        this.items.put(good, quantity);
    }


}
