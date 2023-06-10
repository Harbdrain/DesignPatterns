package com.danil.patterns.structural.bridge;

abstract class Car {
    Manufacturer manufacturer;

    public Car(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    abstract void showDetails();
}
