package com.pluralsight.fixedAsset;

public abstract class Asset {
    private String name;
    private double marketValue;

    public  Asset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }


    public abstract double getValue() ;

}
