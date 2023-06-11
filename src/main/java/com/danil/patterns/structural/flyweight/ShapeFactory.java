package com.danil.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private static final Map<String, Shape> collection = new HashMap<>();

    public Shape get(String id) {
        Shape shape = collection.get(id);
        if (shape == null) {
            switch(id) {
                case "square": {
                    System.out.println("Creating new Square()");
                    shape = new Square(0, 0, 10, 10);
                } break;
                case "circle": {
                    System.out.println("Creating new Circle()");
                    shape = new Circle(5, 5, 3);
                } break;
            }

            collection.put(id, shape);
        }

        return shape;
    }
}
