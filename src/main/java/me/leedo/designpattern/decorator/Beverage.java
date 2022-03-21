package me.leedo.designpattern.decorator;

public abstract class Beverage {
    String name = "no title";

    public abstract int cost();

    public String getName() {
        return name;
    }
}
