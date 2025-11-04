package com.pluralsight.fixedAsset;

import com.pluralsight.finance.Valuable;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }
   //public abstract double getValue();

}
