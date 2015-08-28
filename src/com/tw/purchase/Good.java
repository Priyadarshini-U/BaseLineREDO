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

    public boolean imported() {
        if(checkIfStringContainsImported())
            return true;
        return false;
    }

    private boolean checkIfStringContainsImported() {
        return name.toLowerCase().contains("imported");
    }

    public int totalTaxPercentage() {
        int totalTaxPercentage = 0;
        if (imported())
            totalTaxPercentage += 5;
        if (type.taxable())
            totalTaxPercentage += 10;
        return totalTaxPercentage;
    }

}
