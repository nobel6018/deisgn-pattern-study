package me.leedo.designpattern.bridge;

public class Animal {
    private final HuntingHandler hunting;

    public Animal(HuntingHandler hunting) {
        this.hunting = hunting;
    }

    public void findTarget() {
        hunting.findTarget();
    }

    public void identifyTarget() {
        hunting.identifyTarget();
    }

    public void attack() {
        hunting.attack();
    }

    public void hunt() {
        findTarget();
        identifyTarget();
        attack();
    }
}
