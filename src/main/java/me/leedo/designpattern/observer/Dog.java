package me.leedo.designpattern.observer;

public class Dog implements Observer {
    @Override
    public void update() {
        System.out.println("Dog sparks");
    }
}
