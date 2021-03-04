package com.patterns.creationals.builder;


//CLASE DIRECTOR
public class Director {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;

    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();

    }

    public void construirPizza() {
        pizzaBuilder.crearPizza();
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildCondimentos();
    }
}
