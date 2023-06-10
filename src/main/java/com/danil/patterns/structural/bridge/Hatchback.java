package com.danil.patterns.structural.bridge;

class Hatchback extends Car {

    public Hatchback(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    void showDetails() {
        System.out.println("Hatchback");
        manufacturer.setManufacturer();
    }
}
