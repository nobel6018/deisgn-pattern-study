package me.leedo.designpattern.strategy2;

import java.time.LocalTime;

public class FixAmountDiscountPolicy implements DiscountPolicy {

    private final int discountAmount;

    public FixAmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public boolean support(LocalTime time) {
        return time.isBefore(LocalTime.of(20, 0, 0));
    }

    @Override
    public int discount(int itemPrice) {
        return discountAmount;
    }
}