package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //while ciklussal
        /*
        CoffeeMachine machine = new CoffeeMachine();
        Coffee boughtCoffee = null;

        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Adj meg egy kódot!");
            String code = scn.nextLine();
            boughtCoffee = machine.buyCoffee(code);

            if (boughtCoffee == null) {
                break;
            }
            System.out.println(boughtCoffee.getName());
        }
    }
         */
        //do-while ciklussal
        CoffeeMachine machine = new CoffeeMachine();
        Coffee boughtCoffee = null;
        Scanner scn = new Scanner(System.in);
        try {
            do {
                System.out.println("Adj meg egy kódot!");
                String code = scn.nextLine();
                boughtCoffee = machine.buyCoffee(code);
                System.out.println(boughtCoffee.getName());
            }
            while (boughtCoffee != null);
        } catch (Exception NullPointerException) {
        }
    }
}
