package me.leedo.designpattern.observer;

public class Cat implements Observer {
    @Override
    public void update() {
        System.out.println("Cat meows");
    }
}
