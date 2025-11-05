package com.pluralsight.fixedAsset;

import com.pluralsight.finance.Valuable;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    @Override
    public String toString() {
        return "Jewelry{" +
                "Cost =" + getValue() +
                '}';
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
