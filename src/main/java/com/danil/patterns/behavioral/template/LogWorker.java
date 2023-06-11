package com.danil.patterns.behavioral.template;

class LogWorker extends TemplateWorker {
    @Override
    void template() {
        System.out.println("Writing data to log...");
    }
}
