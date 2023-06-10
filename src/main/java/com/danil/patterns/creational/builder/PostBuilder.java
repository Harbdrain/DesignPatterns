package com.danil.patterns.creational.builder;

abstract class PostBuilder {
    Post post;

    public void createPost() {
        post = new Post();
    }

    abstract void buildContent();

    abstract void buildMaxLength();

    public Post getPost() {
        return post;
    }
}
