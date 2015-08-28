package com.tw.purchase;

public class Type {
    private String name;

    public Type(String name) {
        this.name = name;
    }

    private boolean inSalesTaxExemptedList() {
        if (name.equals("Foods") || name.equals("Books") || name.equals("Medicines"))
            return true;
        return false;
    }

    boolean taxable() {
        if (inSalesTaxExemptedList())
            return false;
        return true;
    }

}
