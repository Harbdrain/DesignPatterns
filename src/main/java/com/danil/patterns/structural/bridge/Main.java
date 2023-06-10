package com.danil.patterns.structural.bridge;

class Main {
    public static void main(String[] args) {
        Car car = new Sedan(new Skoda());
        Car car2 = new Sedan(new Kia());

        car.showDetails();
        car2.showDetails();
    }
}
