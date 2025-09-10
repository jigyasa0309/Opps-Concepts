package com.regiontax;

public enum Region {
    R1("USA"),
    R2("Europe"),
    R3("Asia"),
    R4("Africa");

    private final String continent;

    Region(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
}
