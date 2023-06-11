package com.danil.patterns.behavioral.memento;

class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.setLevel(1);
        game.setX(10);
        game.setY(10);
        System.out.println(game);

        SaveFile file = new SaveFile();
        file.setGameMemento(game.save());

        game.setLevel(4);
        game.setX(20);
        game.setY(30);
        System.out.println(game);

        game.load(file.getGameMemento());
        System.out.println(game);
    }
}
