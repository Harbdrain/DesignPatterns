package com.danil.patterns.builder;

class LongPostBuilder extends PostBuilder {

    @Override
    void buildContent() {
        post.setContent("Long Post");
    }

    @Override
    void buildMaxLength() {
        post.setMaxLength(2000);
    }
}
