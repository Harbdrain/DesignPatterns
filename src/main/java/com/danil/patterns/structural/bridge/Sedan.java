package com.danil.patterns.structural.bridge;

class Sedan extends Car {

    public Sedan(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    void showDetails() {
        System.out.println("Sedan");
        manufacturer.setManufacturer();
    }
}
