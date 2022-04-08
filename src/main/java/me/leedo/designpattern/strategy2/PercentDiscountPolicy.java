package me.leedo.designpattern.strategy2;

public class PercentDiscountPolicy implements DiscountPolicy {

    private final int discountPercent;

    public PercentDiscountPolicy(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public int discount(int itemPrice) {
        // 퍼센트 할인시 생기는 소수점 자리는 버림 처리
        return (int) (itemPrice * discountPercent * 0.01);
    }
}
