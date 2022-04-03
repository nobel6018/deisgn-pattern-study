package me.leedo.designpattern.strategy;

public class HappyHourStrategy implements BillingStrategy {
    @Override
    public double getPrice(double rawPrice) {
        return rawPrice * 0.5;
    }
}
