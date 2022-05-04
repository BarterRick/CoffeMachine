package com.company;

public class CoffeeMachine {
    public Coffee buyCoffee(String code){
        switch (code) {
            case "A1":
                return new Espresso();
            case "A2":
                return new DoubleEspresso();
            case "A3":
                return new Cortado();
            default:
                return null;
        }
    }
}
