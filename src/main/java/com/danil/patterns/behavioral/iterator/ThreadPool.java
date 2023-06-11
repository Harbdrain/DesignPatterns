package com.danil.patterns.behavioral.iterator;

class ThreadPool implements Collection<String> {
    String[] threads;

    public ThreadPool(String[] threads) {
        this.threads = threads;
    }

    public String[] getThreads() {
        return threads;
    }

    public void setThreads(String[] threads) {
        this.threads = threads;
    }

    @Override
    public Iterator<String> getIterator() {
        return new ThreadsIterator();
    }

    private class ThreadsIterator implements Iterator<String> {
        int pos = 0;
        @Override
        public boolean hasNext() {
            return pos < threads.length;
        }

        @Override
        public String next() {
            return threads[pos++];
        }
    }
}
