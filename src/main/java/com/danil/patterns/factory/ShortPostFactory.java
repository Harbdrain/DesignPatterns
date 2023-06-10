package com.danil.patterns.factory;

class ShortPostFactory implements PostFactory {
    @Override
    public Post createPost() {
        LongPost post = new LongPost();
        post.setMaxLength(200);
        post.setContent("short post");
        return post;
    }
}
