package com.danil.patterns.structural.composite;

abstract class BaseShape implements Shape {
    int x, y;
    int color;

    public BaseShape(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
