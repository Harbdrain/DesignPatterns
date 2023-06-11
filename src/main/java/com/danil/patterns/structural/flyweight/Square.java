package com.danil.patterns.structural.flyweight;

class Square implements Shape {
    int x, y;
    int w, h;

    public Square(int h, int x, int y, int w) {
        this.h = h;
        this.x = x;
        this.y = y;
        this.w = w;
    }

    @Override
    public void draw() {
        System.out.println("Circle: x = " + x + ". y = " + y + ". w = " + w + ". h = " + h);
    }
}
