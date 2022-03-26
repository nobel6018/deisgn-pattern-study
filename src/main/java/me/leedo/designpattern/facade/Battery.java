package me.leedo.designpattern.facade;

public class Battery implements Component {
    public Battery() {
    }

    @Override
    public String getName() {
        return "Battery";
    }

    public void givePower(Component component) {
        System.out.println("giving power to " + component.getName());
    }
}
