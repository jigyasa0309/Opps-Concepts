package org.example;


public class R4Car extends Car {
    public R4Car(String country) {
        super(country, Region.R4);
    }

    @Override
    public double calculatePrice() {
        return 18000;
    }

    @Override
    public double calculateTax() {
        return calculatePrice() * 0.05;
    }
}
