package com.danil.patterns.behavioral.strategy;

class Player implements Context {
    State state;

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void execute() {
        state.execute();
    }
}
