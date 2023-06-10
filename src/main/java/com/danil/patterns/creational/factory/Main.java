package com.danil.patterns.creational.factory;

class Main {
    public static void main(String[] args) {
        PostFactory factory = createPostFactory("long");
        Post post = factory.createPost();
        System.out.println(post.getContent());
    }

    static PostFactory createPostFactory(String type) {
        if ("long".equals(type)) {
            return new LongPostFactory();
        } else if ("short".equals(type)) {
            return new ShortPostFactory();
        }
        throw new RuntimeException("Unknown PostFactory type");
    }
}
