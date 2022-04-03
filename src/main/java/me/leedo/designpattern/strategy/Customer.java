package me.leedo.designpattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final List<Double> drinks = new ArrayList<>();
    private BillingStrategy billingStrategy;

    public Customer(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void orderDrink(double price, int quantity) {
        double netPrice = billingStrategy.getPrice(price * quantity);
        drinks.add(netPrice);
    }

    public void printBillAndReset() {
        double totalPrice = 0;
        for (Double drink : drinks) {
            totalPrice += drink;
        }

        System.out.println("totalPrice = " + totalPrice);
    }
}
