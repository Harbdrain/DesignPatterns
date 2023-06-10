package com.danil.patterns.structural.adapter;

class ExternalLibraryDatabase {
    public void save() {
        System.out.println("save");
    }

    public void get() {
        System.out.println("get");
    }

    public void change() {
        System.out.println("update");
    }

    public void remove() {
        System.out.println("remove");
    }
}
