package org.example;

public abstract class Car {
    protected String country;
    protected Region region;

    public Car(String country, Region region) {
        this.country = country;
        this.region = region;
    }

    public abstract double calculatePrice();
    public abstract double calculateTax();

    public void displayDetails() {
        System.out.println("Country: " + country);
        System.out.println("Region: " + region + " (" + region.getContinent() + ")");
        System.out.println("Price: $" + calculatePrice());
        System.out.println("Tax: $" + calculateTax());
    }
}
