package com.danil.patterns.behavioral.visitor;

class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Polished the body");
    }

    @Override
    public void visit(BodyElement engine) {
        System.out.println("Checked the engine");
    }
}
