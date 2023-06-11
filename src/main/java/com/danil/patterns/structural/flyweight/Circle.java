package com.danil.patterns.structural.flyweight;

class Circle implements Shape {
    private int x, y;
    private int r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Circle: x = " + x + ". y = " + y + ". r = " + r);
    }

}
