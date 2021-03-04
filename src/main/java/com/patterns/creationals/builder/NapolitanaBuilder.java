package com.patterns.creationals.builder;


//CONCRETE BUILDER#1
public class NapolitanaBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() {
        pizza.setMasa("Suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("comun");
    }

    @Override
    public void buildCondimentos() {
        pizza.setCondimentos("tomate");
    }
}
