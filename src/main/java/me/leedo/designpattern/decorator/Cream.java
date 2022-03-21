package me.leedo.designpattern.decorator;

public class Cream extends CondimentDecorator {
    Beverage beverage;

    public Cream(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 500;
    }

    @Override
    public String getName() {
        return beverage.getName() + ", 크림";
    }
}
