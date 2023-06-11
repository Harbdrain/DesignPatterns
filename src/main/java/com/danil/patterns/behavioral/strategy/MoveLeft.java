package com.danil.patterns.behavioral.strategy;

class MoveLeft implements State {
    @Override
    public void execute() {
        System.out.println("Moving left...");
    }
}
