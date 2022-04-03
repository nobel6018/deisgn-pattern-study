package me.leedo.designpattern.strategy;

public interface BillingStrategy {
    public double getPrice(double rawPrice);
}
