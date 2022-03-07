package me.leedo.designpattern.factory;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("bark");
    }
}
