package com.danil.patterns.structural.composite;

class Main {
    public static void main(String[] args) {
        Renderer renderer = new Renderer();
        renderer.addShape(new Point(0, 0, 10));
        renderer.addShape(new Point(5, 3, 20));
        renderer.addShape(new Circle(1, 1, 4, 30));
        renderer.addShape(new Rectangle(-20, -20, 5, 5, 50));

        renderer.draw();
    }
}
