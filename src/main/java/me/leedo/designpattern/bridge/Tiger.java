package me.leedo.designpattern.bridge;

public class Tiger extends Animal {
    public Tiger(HuntingHandler hunting) {
        super(hunting);
    }

    public void hunt() {
        System.out.println("호랑이의 사냥방식");
        findTarget();
        identifyTarget();
        attack();
    }
}
