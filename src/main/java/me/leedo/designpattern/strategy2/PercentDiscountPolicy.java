package me.leedo.designpattern.strategy2;

import java.time.LocalTime;

public class PercentDiscountPolicy implements DiscountPolicy {

    private final int discountPercent;

    public PercentDiscountPolicy(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public boolean support(LocalTime time) {
        return time.isAfter(LocalTime.of(20, 0, 0));
    }

    @Override
    public int discount(int itemPrice) {
        // 퍼센트 할인시 생기는 소수점 자리는 버림 처리
        return (int) (itemPrice * discountPercent * 0.01);
    }
}