package com.pluralsight.fixedAsset;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Asset> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Asset asset) {
        assets.add(asset);
    }

    public double getValue() {
        double total = 0.0;
        for (int i = 0; i < assets.size(); i++) {
            total += assets.get(i).getValue();
        }
        return total;
    }
}
