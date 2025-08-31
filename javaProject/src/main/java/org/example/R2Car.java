package org.example;


public class R2Car extends Car {
    public R2Car(String country) {
        super(country, Region.R2);
    }

    @Override
    public double calculatePrice() {
        return 5000;
    }

    @Override
    public double calculateTax() {
        return calculatePrice() * 0.15;
    }
}
