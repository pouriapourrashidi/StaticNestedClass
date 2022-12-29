package com.advanced.innerclass.staticnested;

import com.advanced.enumcoding.PizzaSize;

public class PizzaBuilderApp {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Americano",PizzaSize.large).withExtraSause(true).
                withExtraSalad(true).build();
        System.out.println(pizza.getName());
        System.out.println(pizza.getPizzaSize().getPizzaSizeText());
        System.out.println(pizza.isExtraSause());
    }
}
