package com.tw.purchase;

public class Good {
    private String name;
    private double price;
    private Type type;

    public Good(String name, double price, Type type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
