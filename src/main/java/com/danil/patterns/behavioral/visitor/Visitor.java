package com.danil.patterns.behavioral.visitor;

interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement engine);
}
