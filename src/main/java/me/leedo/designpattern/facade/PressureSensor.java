package me.leedo.designpattern.facade;

public class PressureSensor implements Component {
    public PressureSensor() {
    }

    @Override
    public String getName() {
        return "Pressure Sensor";
    }

    public void activate() {
        System.out.println("Pressure sensor is activated");
    }
}
