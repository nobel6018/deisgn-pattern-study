package me.leedo.designpattern.observer2;

import java.util.ArrayList;
import java.util.List;

public class Father {
    private final List<Observable> iotList = new ArrayList<>();

    public void addIoT(Observable iot) {
        iotList.add(iot);
    }

    public void arrivedHome() {
        for (Observable iot : iotList) {
            iot.onArrive();
        }
    }
}
