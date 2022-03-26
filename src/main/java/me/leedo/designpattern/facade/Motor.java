package me.leedo.designpattern.facade;

public class Motor implements Component {
    public Motor() {
    }

    @Override
    public String getName() {
        return "Motor";
    }

    public void rotate() {
        System.out.println("Motor is rotating");
    }
}
