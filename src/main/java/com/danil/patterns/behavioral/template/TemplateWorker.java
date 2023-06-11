package com.danil.patterns.behavioral.template;

abstract class TemplateWorker {
    void execute() {
        System.out.println("Reading data from socket...");
        template();
        System.out.println("Notifying user");
    }

    abstract void template();
}
