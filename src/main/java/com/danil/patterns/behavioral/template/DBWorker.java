package com.danil.patterns.behavioral.template;

class DBWorker extends TemplateWorker {
    @Override
    void template() {
        System.out.println("Writing data to MySQL...");
    }
}
