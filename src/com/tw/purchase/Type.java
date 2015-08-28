package com.tw.purchase;

public class Type {
    String name;

    public Type(String name) {
        this.name = name;
    }

    boolean taxable(){
        return true;
    }

}
