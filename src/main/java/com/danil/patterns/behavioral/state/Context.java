package com.danil.patterns.behavioral.state;

interface Context {
    void setState(State state);
    void execute();
}
