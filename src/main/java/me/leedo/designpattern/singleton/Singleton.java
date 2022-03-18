package me.leedo.designpattern.singleton;

public class Singleton {
    private static Singleton instance;

    private int number;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

// ref:
// https://jungwoon.github.io/java/2019/08/11/Singleton-Pattern-with-Multi-Thread.html
// https://javaplant.tistory.com/21
// https://jeong-pro.tistory.com/86