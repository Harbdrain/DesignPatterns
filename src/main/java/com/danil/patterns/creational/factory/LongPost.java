package com.danil.patterns.creational.factory;

class LongPost implements Post {
    private String content;
    private int maxLength;

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
