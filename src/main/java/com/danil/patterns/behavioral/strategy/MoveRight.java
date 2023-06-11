package com.danil.patterns.behavioral.strategy;

class MoveRight implements State {
    @Override
    public void execute() {
        System.out.println("Moving right...");
    }
}
