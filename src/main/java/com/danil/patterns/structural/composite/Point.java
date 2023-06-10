package com.danil.patterns.structural.composite;

class Point extends BaseShape {

    public Point(int x, int y, int color) {
        super(x, y, color);
    }

    @Override
    public void draw() {
        System.out.println("Point: x=" + x + ". y=" + y + ". color=" + color);
    }
}
