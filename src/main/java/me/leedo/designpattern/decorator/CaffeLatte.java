package me.leedo.designpattern.decorator;

public class CaffeLatte extends Beverage {
    public CaffeLatte() {
        super();
        name = "카페라떼";
    }

    @Override
    public int cost() {
        return 5000;
    }
}
