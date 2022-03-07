package me.leedo.designpattern.factorymethod;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("meow");
    }
}
