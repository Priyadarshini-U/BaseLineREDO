package com.tw.purchase;

public class Type {
    String name;

    public Type(String name) {
        this.name = name;
    }

    boolean taxable(){
        if(name.equals("Foods"))
            return false;
        if(name.equals("Books"))
            return false;
        if(name.equals("Medicines"))
            return false;
        return true;
    }

}
