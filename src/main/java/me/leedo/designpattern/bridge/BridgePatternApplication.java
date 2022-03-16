package me.leedo.designpattern.bridge;

// ref: https://lktprogrammer.tistory.com/35
public class BridgePatternApplication {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(new GroundHunting());
        tiger.hunt();

        Bird eagle = new Bird(new WaterHunting());
        eagle.hunt();
    }
}
