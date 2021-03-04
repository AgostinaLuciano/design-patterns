package com.patterns.creationals.builder;

public class Main {

    public static void main(String[] args) {
        Director d = new Director();

        PizzaBuilder jmPizza = new JamonYMorronBuilder();
        PizzaBuilder napoPizza = new NapolitanaBuilder();

        d.setPizzaBuilder(napoPizza);

        d.construirPizza();

        Pizza pizza = d.getPizza();

    }

}
