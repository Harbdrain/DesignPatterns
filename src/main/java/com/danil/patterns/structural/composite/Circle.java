package com.danil.patterns.structural.composite;

class Circle extends BaseShape {
    int r;

    public Circle(int x, int y, int r, int color) {
        super(x, y, color);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Circle: x=" + x + ". y=" + y + ". r=" + r + ". color=" + color);
    }

}
