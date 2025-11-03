package com.pluralsight.fixedAsset;

public class Gold extends Asset {
    private double weight;


    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
