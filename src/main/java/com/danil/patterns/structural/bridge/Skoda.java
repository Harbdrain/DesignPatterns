package com.danil.patterns.structural.bridge;

class Skoda implements Manufacturer {
    @Override
    public void setManufacturer() {
        System.out.println("Skoda");
    }
}
