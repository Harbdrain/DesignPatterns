package com.danil.patterns.structural.facade;

class ComputerFacade {
    Computer computer = new Computer();

    public void turnOn() {
        computer.makeSound();
        computer.showLoadingScreen();
        computer.complete();
    }

    public void turnOff() {
        computer.closeEverything();
        computer.turnOffScreen();
        computer.makeSound();
    }
}
