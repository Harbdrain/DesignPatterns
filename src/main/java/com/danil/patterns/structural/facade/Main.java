package com.danil.patterns.structural.facade;

class Main {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.turnOn();
        facade.turnOff();
    }
}
