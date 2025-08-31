package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountryRegionMapper {
    private static final Map<String, Region> countryRegionMap = new HashMap<>();

    static {
        countryRegionMap.put("USA", Region.R1);
        countryRegionMap.put("Germany", Region.R2);
        countryRegionMap.put("India", Region.R3);
        countryRegionMap.put("Russia", Region.R3);
        countryRegionMap.put("Africa", Region.R4);
        countryRegionMap.put("France", Region.R2);

    }

    public static Region getRegionByCountry(String country) {
        Region region = countryRegionMap.get(country);
        if (region == null) {
            throw new IllegalArgumentException("Unknown country: " + country);
        }
        return region;
    }
}
