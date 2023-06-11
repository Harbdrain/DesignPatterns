package com.danil.patterns.behavioral.visitor;

class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Knocked on the body");
    }

    @Override
    public void visit(BodyElement engine) {
        System.out.println("Overflowed the engine");
    }
}
