package com.pluralsight.fixedAsset;

import com.pluralsight.finance.Valuable;

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


    @Override
    public int compareTo(Valuable o) {
        return Double.compare(this.getValue(),o.getValue());
    }
}
