package com.pluralsight.fixedAsset;

public class Gold extends FixedAsset {
    private double weight;


    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getName() + " - $ " + getValue();
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
