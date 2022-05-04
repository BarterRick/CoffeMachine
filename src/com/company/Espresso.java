package com.company;

public class Espresso extends Coffee {
    public Espresso(){
        setPrice(550);
    }

    @Override
    public String getName() {
        return "Espresso";
    }
}
