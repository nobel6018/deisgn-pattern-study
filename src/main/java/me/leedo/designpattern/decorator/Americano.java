package me.leedo.designpattern.decorator;

public class Americano extends Beverage {
    public Americano() {
        super();
        name = "아메리카노";
    }

    @Override
    public int cost() {
        return 4000;
    }
}
