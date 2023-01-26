package me.leedo.designpattern.strategy2;

import java.time.LocalTime;
import java.util.List;

public class PriceCalculator {

    private final List<DiscountPolicy> discountPolicies;

    public PriceCalculator(List<DiscountPolicy> discountPolicies) {
        this.discountPolicies = discountPolicies;
    }

    public int getDiscountedPrice(List<Integer> items) {
        int totalPrice = items.stream().reduce(0, Integer::sum);

        DiscountPolicy discountPolicy = routingDiscountPolicy();
        int totalDiscount = discountPolicy.discount(totalPrice);

        return totalPrice - totalDiscount;
    }

    // ⭐️ routing 함수를 통해서 적합한 할인전략을 선택합니다
    private DiscountPolicy routingDiscountPolicy() {
        LocalTime now = LocalTime.now();

        return discountPolicies.stream()
            .filter(discountPolicy -> discountPolicy.support(now))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("There is no matching discount policy"));
    }
}