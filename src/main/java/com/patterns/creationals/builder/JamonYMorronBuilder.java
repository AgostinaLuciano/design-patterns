package com.patterns.creationals.builder;

public class JamonYMorronBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() {
        pizza.setMasa("firme");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("especial");

    }

    @Override
    public void buildCondimentos() {
        pizza.setCondimentos("jamon y morron");
    }
}
