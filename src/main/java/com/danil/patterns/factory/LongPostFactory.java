package com.danil.patterns.factory;

class LongPostFactory implements PostFactory {
    @Override
    public Post createPost() {
        LongPost post = new LongPost();
        post.setMaxLength(2000);
        post.setContent("long post");
        return post;
    }
}
