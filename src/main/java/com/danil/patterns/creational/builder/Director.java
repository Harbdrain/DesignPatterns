package com.danil.patterns.creational.builder;

class Director {
    private PostBuilder builder;

    public void setBuilder(PostBuilder builder) {
        this.builder = builder;
    }

    public Post buildPost() {
        builder.createPost();
        builder.buildMaxLength();
        builder.buildContent();
        return builder.getPost();
    }
}
