package com.pluralsight.fixedAsset;

import com.pluralsight.finance.Valuable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        valuables = new ArrayList<>();
    }

    public void add(Valuable valuable) {
        valuables.add(valuable);
        Collections.sort(valuables);
    }

    public double getValue() {
        double totalValue = 0;
        for (Valuable valuable : valuables) {
            totalValue += valuable.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {
       return Collections.max(valuables);
    }

    public Valuable getLeastValuable() {
        Valuable lowValue = valuables.get(0);
        for (int i = 1; i < valuables.size(); i++) {
            if (valuables.get(i).getValue() < lowValue.getValue()) {
                lowValue = valuables.get(i);
            }
        }
        return lowValue;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' + ", assets=" + valuables +
                '}';
    }
}
