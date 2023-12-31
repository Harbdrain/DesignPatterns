package com.danil.patterns.behavioral.visitor;

class BodyElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
