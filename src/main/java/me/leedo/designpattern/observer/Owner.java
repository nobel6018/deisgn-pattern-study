package me.leedo.designpattern.observer;


import java.util.ArrayList;
import java.util.List;

public class Owner {
    private final List<Observer> animals = new ArrayList<>();

    public void register(Observer animal) {
        animals.add(animal);
    }

    // equivalent to notify function
    public void arrivedHome() {
        for (Observer animal : animals) {
            animal.update();
        }
    }
}
