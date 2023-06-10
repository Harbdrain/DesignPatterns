package com.danil.patterns.structural.adapter;

class Main {
    public static void main(String[] args) {
        Database database = new ExternalLibraryDatabaseToDatabaseAdapter();

        database.create();
        database.read();
        database.update();
        database.delete();
    }
}
