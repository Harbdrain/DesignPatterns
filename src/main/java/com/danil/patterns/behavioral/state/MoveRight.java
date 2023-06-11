package com.danil.patterns.behavioral.state;

class MoveRight implements State {
    @Override
    public void execute() {
        System.out.println("Moving right...");
    }
}
