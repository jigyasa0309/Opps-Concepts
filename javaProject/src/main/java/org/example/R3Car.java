package org.example;

public class R3Car extends Car {
    public R3Car(String country) {
        super(country, Region.R3);
    }

    @Override
    public double calculatePrice() {
        return 20000;
    }

    @Override
    public double calculateTax() {
        return calculatePrice() * 0.08;
    }
}
