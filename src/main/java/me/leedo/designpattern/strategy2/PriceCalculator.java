package me.leedo.designpattern.strategy2;

import java.util.List;

public class PriceCalculator {
    private DiscountPolicy discountPolicy;

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public int getSalePrice(List<Integer> items) {
        int totalOriginalPrice = items.stream().reduce(0, Integer::sum);
        int totalDiscount = discountPolicy.discount(totalOriginalPrice);

        return totalOriginalPrice - totalDiscount;
    }

    // public int getTotalOriginalPrice(List<Integer> items) {
    //     return items.stream().reduce(0, Integer::sum);
    // }
    //
    // public int getTotalDiscountPrice(List<Integer> items) {
    //     if (discountPolicy == null) {
    //         return 0;
    //     }
    //
    //     return items.stream().reduce(0, (subtotal, element) -> subtotal + discountPolicy.discount(element));
    //
    //     // equals the following code. ref: https://www.baeldung.com/java-stream-reduce
    //     // int totalDiscountPrice = 0;
    //     // for (Integer item : items) {
    //     //     totalDiscountPrice += discountPolicy.discount(item);
    //     // }
    //     //
    //     // return totalDiscountPrice;
    // }
}
