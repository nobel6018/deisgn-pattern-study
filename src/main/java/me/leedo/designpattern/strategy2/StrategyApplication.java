package me.leedo.designpattern.strategy2;

import java.util.Arrays;
import java.util.List;

public class StrategyApplication {
    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        List<Integer> itemPrices = Arrays.asList(1000, 2000, 3000);

        // 🎉 오픈할인: 5퍼센트 할인 행사
        PercentDiscountPolicy fivePercentDiscountPolicy = new PercentDiscountPolicy(5);
        priceCalculator.setDiscountPolicy(fivePercentDiscountPolicy);

        int salePrice = priceCalculator.getSalePrice(itemPrices);
        System.out.println("salePrice = " + salePrice);


        // 🎉 마감할인: 2천원 고정할인 행사 시작
        FixAmountDiscountPolicy fixAmountDiscountPolicy = new FixAmountDiscountPolicy(2_000);
        priceCalculator.setDiscountPolicy(fixAmountDiscountPolicy);

        int salePrice2 = priceCalculator.getSalePrice(itemPrices);
        System.out.println("salePrice2 = " + salePrice2);
    }
}