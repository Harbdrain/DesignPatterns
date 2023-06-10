package com.danil.patterns.structural.facade;

class Computer {
    public void makeSound() {
        System.out.println("Beep!");
    }

    public void showLoadingScreen() {
        System.out.println("Loading...");
    }

    public void complete() {
        System.out.println("Ready to be used");
    }

    public void closeEverything() {
        System.out.println("Closing everything...");
    }

    public void turnOffScreen() {
        System.out.println("RIP screen");
    }
}
