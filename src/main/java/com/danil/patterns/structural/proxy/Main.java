package com.danil.patterns.structural.proxy;

class Main {
    public static void main(String[] args) {
        Project project = new MyProjectProxy("https://d-demchenko.ru/project");

        project.run(); // Lazy Load. Will load project only when call this method.
    }
}
