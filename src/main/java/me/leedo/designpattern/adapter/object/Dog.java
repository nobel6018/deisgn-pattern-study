package me.leedo.designpattern.adapter.object;

public class Dog implements Animal {
    @Override
    public void walk() {
        System.out.println("Dog walks");
    }
}
