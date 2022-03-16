package me.leedo.designpattern.bridge;

public class WaterHunting implements HuntingHandler {
    @Override
    public void findTarget() {
        System.out.println("물 위에서 찾는다");
    }

    @Override
    public void identifyTarget() {
        System.out.println("물고기 발견");
    }

    @Override
    public void attack() {
        System.out.println("낚아챈다");
    }
}
