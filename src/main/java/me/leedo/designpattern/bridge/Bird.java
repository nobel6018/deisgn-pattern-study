package me.leedo.designpattern.bridge;

public class Bird extends Animal {
    public Bird(HuntingHandler hunting) {
        super(hunting);
    }

    public void hunt() {
        System.out.println("새의 사냥방식");
        findTarget();
        identifyTarget();
        attack();
    }
}
