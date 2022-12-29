package com.advanced.innerclass.staticnested;

import com.advanced.enumcoding.PizzaSize;

public class Pizza {

    private String name;
    private PizzaSize pizzaSize;
    private boolean isExtraSause;
    private boolean isSalad;
    private Pizza(Builder build){
        this.name=build.name;
        this.pizzaSize=build.pizzaSize;
        this.isExtraSause= build.isExtraSause;
        this.isSalad= build.isSalad;
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public boolean isExtraSause() {
        return isExtraSause;
    }

    public boolean isSalad() {
        return isSalad;
    }

    public static class Builder{
        private String name;
        private PizzaSize pizzaSize;
        private boolean isExtraSause;
        private boolean isSalad;

        Builder(String name,PizzaSize pizzaSize){
            this.name=name;
            this.pizzaSize=pizzaSize;
        }

        public Builder withExtraSause(boolean isExtraSause){
            this.isExtraSause=isExtraSause;
            return this;
        }

        public Builder withExtraSalad(boolean isSalad){
            this.isSalad=isSalad;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
