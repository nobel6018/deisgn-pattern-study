package me.leedo.designpattern.strategy2;

import java.util.Arrays;
import java.util.List;

public class StrategyApplication {
    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        List<Integer> itemPrices = Arrays.asList(1000, 2000, 3000);

        // π μ€νν μΈ: 5νΌμΌνΈ ν μΈ νμ¬
        PercentDiscountPolicy fivePercentDiscountPolicy = new PercentDiscountPolicy(5);
        priceCalculator.setDiscountPolicy(fivePercentDiscountPolicy);

        int salePrice = priceCalculator.getSalePrice(itemPrices);
        System.out.println("salePrice = " + salePrice);


        // π λ§κ°ν μΈ: 2μ²μ κ³ μ ν μΈ νμ¬ μμ
        FixAmountDiscountPolicy fixAmountDiscountPolicy = new FixAmountDiscountPolicy(2_000);
        priceCalculator.setDiscountPolicy(fixAmountDiscountPolicy);

        int salePrice2 = priceCalculator.getSalePrice(itemPrices);
        System.out.println("salePrice2 = " + salePrice2);
    }
}