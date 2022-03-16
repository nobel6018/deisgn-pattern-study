package me.leedo.designpattern.bridge;

public class GroundHunting implements HuntingHandler {
    @Override
    public void findTarget() {
        System.out.println("지상에서 찾는다");
    }

    @Override
    public void identifyTarget() {
        System.out.println("노루 발견");
    }

    @Override
    public void attack() {
        System.out.println("물어뜯는다");
    }
}
