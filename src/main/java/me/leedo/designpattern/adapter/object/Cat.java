package me.leedo.designpattern.adapter.object;

public class Cat implements Animal {
    @Override
    public void walk() {
        System.out.println("Cat walks");
    }
}
