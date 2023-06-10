package com.danil.patterns.builder;

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
