package com.pluralsight.fixedAsset;

public class House extends Asset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double value, int year, int squareFeet, int bedrooms) {
        super(name, value);
        this.yearBuilt = year;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
