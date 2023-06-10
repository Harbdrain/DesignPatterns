package com.danil.patterns.creational.builder;

class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new LongPostBuilder());
        Post post = director.buildPost();
        System.out.println(post);
    }
}
