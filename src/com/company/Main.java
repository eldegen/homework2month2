package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("pizza").print();
        createObject("burger").print();
        createObject("chicken").print();
        createObject("when wrong food").print();
    }

    public static Food createObject(String className) {
        switch (className) {
            case "pizza":
                Pizza pizza = new Pizza(true, 5, false, 10);
                return pizza;
            case "burger":
                Burger burger = new Burger(true, 4, "chicken");
                return burger;
            case "chicken":
                Chicken chicken = new Chicken(false, 1, true, "poorly cooked rice");
                return chicken;
            default:
                Pizza defaultPizza = new Pizza(true, 5, true, 5);
                return defaultPizza;
        }
    }
}
