package com.danil.patterns.behavioral.memento;

class GameMemento {
    private final int level;
    private final int x;
    private final int y;

    public GameMemento(int level, int x, int y) {
        this.level = level;
        this.x = x;
        this.y = y;
    }

    public int getLevel() {
        return level;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
