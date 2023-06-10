package com.danil.patterns.structural.decorator;

class CheesePizza extends PizzaDecorator {
    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
}
