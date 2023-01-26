package me.leedo.designpattern.strategy2;

import java.time.LocalTime;

public interface DiscountPolicy {

    public boolean support(LocalTime time);

    public int discount(int itemPrice);
}