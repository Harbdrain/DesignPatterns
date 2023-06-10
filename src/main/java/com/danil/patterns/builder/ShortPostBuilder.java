package com.danil.patterns.builder;

class ShortPostBuilder extends PostBuilder {
    @Override
    void buildContent() {
        post.setContent("Short Post");
    }

    @Override
    void buildMaxLength() {
        post.setMaxLength(200);
    }
}

