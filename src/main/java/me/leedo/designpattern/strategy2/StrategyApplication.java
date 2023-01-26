package me.leedo.designpattern.strategy2;

import java.util.Arrays;
import java.util.List;

public class StrategyApplication {
    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator(
            Arrays.asList(
                new PercentDiscountPolicy(50),
                new FixAmountDiscountPolicy(2_000)
            )
        );

        List<Integer> itemPrices = Arrays.asList(1000, 2000, 3000);

        // 🌞 오전: 오픈 기념 2천원 정액할인 (저녁 10시 이전)
        int morningPrice = priceCalculator.getDiscountedPrice(itemPrices);
        System.out.println("morningPrice = " + morningPrice);  // morningPrice = 4000


        // ⌛️ 같은 코드를 시간이 지나서 저녁 10시가 되었다고 가정...
        // 🌜 저녁: 마감 50% 할인 (저녁 10시 이후)
        int nightPrice = priceCalculator.getDiscountedPrice(itemPrices);
        System.out.println("nightPrice = " + nightPrice);  // nightPrice = 3000
    }
}