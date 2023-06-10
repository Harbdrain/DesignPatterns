package com.danil.patterns.creational.prototype;

class PostFactory {
    private Post post;

    public PostFactory(Post post) {
        this.post = post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    
    public Post clone() {
        return (Post) post.copy();
    }
}
