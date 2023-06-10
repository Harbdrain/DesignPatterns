package com.danil.patterns.builder;

class Post {
    private String content;
    private int maxLength;

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
}
