package me.leedo.designpattern.factory;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("meow");
    }
}
