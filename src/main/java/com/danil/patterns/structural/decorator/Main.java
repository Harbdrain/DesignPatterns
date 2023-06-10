package com.danil.patterns.structural.decorator;

class Main {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new PepperoniPizza();
        
        pepperoniPizza = new CheesePizza(pepperoniPizza);
        String desc = pepperoniPizza.getDescription();
        System.out.println(desc);
    }
}
