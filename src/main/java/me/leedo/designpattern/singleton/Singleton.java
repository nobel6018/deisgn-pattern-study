package me.leedo.designpattern.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// ref:
// https://jeong-pro.tistory.com/86
// https://javaplant.tistory.com/21yo