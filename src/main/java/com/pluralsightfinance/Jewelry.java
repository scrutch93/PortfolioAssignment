package com.pluralsightfinance;

public class Jewelry extends FixedAsset implements Valuable{

    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }


    @Override
    public double getValue() {
        return super.getValue();
    }
}
