package me.leedo.designpattern.facade;

public class CarFacade {
    public void goForward() {
        Battery battery = new Battery();
        Motor motor = new Motor();
        PressureSensor pressureSensor = new PressureSensor();

        battery.givePower(pressureSensor);
        battery.givePower(motor);
        pressureSensor.activate();
        motor.rotate();

        System.out.println("🚗 Car goes forward");
    }
}
