package com.danil.patterns.behavioral.state;

class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.changeDirection();
        player.execute();
        player.changeDirection();
        player.execute();
        player.changeDirection();
        player.execute();
        player.changeDirection();
        player.execute();
        player.changeDirection();
        player.execute();
        player.changeDirection();
        player.execute();
    }
}
