package com.danil.patterns.structural.proxy;

class MyProject implements Project {
    String url;

    public MyProject(String url) {
        this.url = url;
        load();
    }

    private void load() {
        System.out.println("Loading project " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
