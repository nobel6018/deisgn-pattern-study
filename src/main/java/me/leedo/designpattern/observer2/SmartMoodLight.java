package me.leedo.designpattern.observer2;

public class SmartMoodLight implements Observable {
    public void turnOnLight() {
        System.out.println("💡 Turn on light");
    }

    @Override
    public void onArrive() {
        turnOnLight();
    }
}
