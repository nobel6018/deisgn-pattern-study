package me.leedo.designpattern.strategy;

public class NormalStrategy implements BillingStrategy {
    @Override
    public double getPrice(double rawPrice) {
        return rawPrice;
    }
}
