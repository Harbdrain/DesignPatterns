package com.danil.patterns.behavioral.strategy;

interface Context {
    void setState(State state);
    void execute();
}
