package me.leedo.designpattern.strategy2;

public class FixAmountDiscountPolicy implements DiscountPolicy{

    private final int discountAmount;

    public FixAmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int discount(int itemPrice) {
        return discountAmount;
    }
}
