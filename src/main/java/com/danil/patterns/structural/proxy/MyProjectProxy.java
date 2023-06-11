package com.danil.patterns.structural.proxy;

class MyProjectProxy implements Project {
    private String url;
    private MyProject project = null;

    public MyProjectProxy(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (project == null) {
            project = new MyProject(url);
        }

        project.run();
    }
}
