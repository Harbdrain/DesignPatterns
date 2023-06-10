package com.danil.patterns.structural.adapter;

class ExternalLibraryDatabaseToDatabaseAdapter extends ExternalLibraryDatabase implements Database {
    @Override
    public void create() {
        save();
    }

    @Override
    public void read() {
        get();
    }

    @Override
    public void update() {
        change();
    }

    @Override
    public void delete() {
        remove();
    }
}
