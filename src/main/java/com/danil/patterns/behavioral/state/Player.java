package com.danil.patterns.behavioral.state;

class Player implements Context {
    State state;

    @Override
    public void setState(State state) {
        this.state = state;
    }

    public void changeDirection() {
        if (state == null) {
            setState(new MoveRight());
            return;
        }

        if (state instanceof MoveRight) {
            setState(new MoveLeft());
        } else if (state instanceof MoveLeft) {
            setState(new MoveRight());
        }
    }

    @Override
    public void execute() {
        state.execute();
    }
}
