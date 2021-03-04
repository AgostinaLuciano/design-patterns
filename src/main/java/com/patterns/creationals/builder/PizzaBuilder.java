package com.patterns.creationals.builder;

//ABSTRACT BUILDER
public abstract class PizzaBuilder {
   protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void crearPizza(){
        pizza = new Pizza();
    }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildCondimentos();

}
