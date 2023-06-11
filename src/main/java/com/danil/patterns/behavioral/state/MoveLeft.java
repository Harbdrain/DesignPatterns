package com.danil.patterns.behavioral.state;

class MoveLeft implements State {
    @Override
    public void execute() {
        System.out.println("Moving left...");
    }
}
