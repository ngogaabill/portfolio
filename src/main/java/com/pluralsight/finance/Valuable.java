package com.pluralsight.finance;

public interface Valuable extends Comparable<Valuable> {
    public double getValue();
}
