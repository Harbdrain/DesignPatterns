package com.danil.patterns.behavioral.template;

class Main {
    public static void main(String[] args) {
        TemplateWorker dbWorker = new DBWorker();
        TemplateWorker LogWorker = new LogWorker();

        dbWorker.execute();
        LogWorker.execute();
    }
}
