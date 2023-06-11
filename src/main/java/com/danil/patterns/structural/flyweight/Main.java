package com.danil.patterns.structural.flyweight;

class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        factory.get("square").draw();
        factory.get("square").draw();
        factory.get("square").draw();
        factory.get("square").draw();
        factory.get("square").draw();
        factory.get("square").draw();

        factory.get("circle").draw();
        factory.get("circle").draw();
        factory.get("circle").draw();
        factory.get("circle").draw();
        factory.get("circle").draw();
    }
}
