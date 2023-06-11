package com.danil.patterns.behavioral.iterator;

interface Iterator<T> {
    boolean hasNext();
    T next();
}
