package me.leedo.designpattern.strategy;

public class StrategyApplication {
    public static void main(String[] args) {

        Customer firstCustomer = new Customer(new NormalStrategy());

        // 일반 가격 정책
        firstCustomer.orderDrink(3.0, 2);  // 3.0 달러 * 2개

        // 해피타임 시작
        firstCustomer.setBillingStrategy(new HappyHourStrategy());
        firstCustomer.orderDrink(4.0, 3);  // 4.0 달러 * 3개

        firstCustomer.printBillAndReset();

        // new customer
        Customer secondCustomer = new Customer(new HappyHourStrategy());
        secondCustomer.orderDrink(9.0, 1);

        // End Happy Hour
        secondCustomer.orderDrink(7.0, 4);

        secondCustomer.printBillAndReset();
    }
}
