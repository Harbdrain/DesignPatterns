package com.danil.patterns.behavioral.memento;

class Game {
    private int level = 0;
    private int x = 0;
    private int y = 0;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public GameMemento save() {
        return new GameMemento(level, x, y);
    }

    public void load(GameMemento gameMemnto) {
        this.level = gameMemnto.getLevel();
        this.x = gameMemnto.getX();
        this.y = gameMemnto.getY();
    }

    @Override
    public String toString() {
        return "Game{level=" + level + ", x=" + x + ", y=" + y + "}";
    }
}
