package com.danil.patterns.structural.bridge;

class Kia implements Manufacturer {
    @Override
    public void setManufacturer() {
        System.out.println("Kia");
    }
}
