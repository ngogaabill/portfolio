package com.pluralsight.fixedAsset;

import com.pluralsight.finance.Valuable;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double value, int year, int squareFeet, int bedrooms) {
        super(name, value);
        this.yearBuilt = year;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    @Override
    public String toString() {
        return getName() + " - $" + getValue();
    }

    @Override
    public double getValue() {
        int pricePerFeet = 100;
        return squareFeet * 100; //200 * 100 = 20000
    }

    @Override
    public int compareTo(Valuable o) {
        return Double.compare(this.getValue(),o.getValue());
    }
}
