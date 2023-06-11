package com.danil.patterns.behavioral.iterator;

class Main {
    public static void main(String[] args) {
        String[] threads = {
            "First thread",
            "Second thread",
            "Third thread",
            "Main thread"
        };

        ThreadPool pool = new ThreadPool(threads);

        Iterator<String> iterator = pool.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
