package com.danil.patterns.structural.decorator;

class PinapplePizza extends PizzaDecorator {
    public PinapplePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pinapple";
    }
}
