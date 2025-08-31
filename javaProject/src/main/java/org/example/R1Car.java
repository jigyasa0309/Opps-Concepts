package org.example;

public class R1Car extends Car {
    public R1Car(String country) {
        super(country, Region.R1);
    }

    @Override
    public double calculatePrice() {
        return 2000;     }

    @Override
    public double calculateTax() {
        return calculatePrice() * 0.1;
    }
}
