package com.danil.patterns.structural.composite;

class Rectangle extends BaseShape {
    int w, h;

    public Rectangle(int x, int y, int w, int h, int color) {
        super(x, y, color);
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: x=" + x + ". y=" + y + ". w=" + w + ". h=" + h + ". color=" + color);
    }
}
