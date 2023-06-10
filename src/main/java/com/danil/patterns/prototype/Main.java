package com.danil.patterns.prototype;

class Main {
    public static void main(String[] args) {
        Post post = new Post("Long Post", 2000);
        PostFactory factory = new PostFactory(post);
        Post copy = factory.clone();
        System.out.println(copy);
    }
}
