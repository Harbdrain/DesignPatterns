package com.danil.patterns.prototype;

class Post implements Copyable {
    private String content;
    private int maxLength;

    public Post() {
    }

    public Post(String content, int maxLength) {
        this.content = content;
        this.maxLength = maxLength;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public String toString() {
        return "Post{content=" + content + ", maxLength=" + maxLength + "}";
    }

    @Override
    public Object copy() {
        return new Post(this.content, this.maxLength);
    }
}
