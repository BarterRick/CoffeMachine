package com.company;

public class Cortado extends Coffee {
    public Cortado(){
        setPrice(450);
    }

    @Override
    public String getName() {
        return "Cortado";
    }
}
