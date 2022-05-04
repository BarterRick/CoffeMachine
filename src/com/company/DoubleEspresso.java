package com.company;

public class DoubleEspresso extends Coffee {
    public DoubleEspresso(){
        setPrice(800);
    }

    @Override
    public String getName() {
        return "DoubleEspresso";
    }
}
