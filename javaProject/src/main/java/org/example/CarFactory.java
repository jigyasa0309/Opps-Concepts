package org.example;

public class CarFactory {
    public static Car createCar(String country) {
        Region region = CountryRegionMapper.getRegionByCountry(country);

        switch (region) {
            case R1:
                return new R1Car(country);
            case R2:
                return new R2Car(country);
            case R3:
                return new R3Car(country);
            case R4:
                return new R4Car(country);
            default:
                throw new IllegalArgumentException("not supported region: " + region);
        }
    }
}
