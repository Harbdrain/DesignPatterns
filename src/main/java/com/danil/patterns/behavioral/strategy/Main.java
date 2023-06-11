package com.danil.patterns.behavioral.strategy;

class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.setState(new MoveLeft());
        player.execute();
        player.setState(new MoveRight());
        player.execute();
    }
}
