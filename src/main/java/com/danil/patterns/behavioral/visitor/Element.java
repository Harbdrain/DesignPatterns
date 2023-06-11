package com.danil.patterns.behavioral.visitor;

interface Element {
    void accept(Visitor visitor);
}
