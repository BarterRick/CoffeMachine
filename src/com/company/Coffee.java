package com.company;

public abstract class Coffee {
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public abstract String getName();
}


