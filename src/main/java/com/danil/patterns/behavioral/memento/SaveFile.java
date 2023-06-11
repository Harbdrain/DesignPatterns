package com.danil.patterns.behavioral.memento;

class SaveFile {
    GameMemento gameMemento;

    public GameMemento getGameMemento() {
        return gameMemento;
    }

    public void setGameMemento(GameMemento saveFile) {
        this.gameMemento = saveFile;
    }
}
