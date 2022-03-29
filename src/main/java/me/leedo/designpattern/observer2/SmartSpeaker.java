package me.leedo.designpattern.observer2;

public class SmartSpeaker implements Observable {
    public void playMusic() {
        System.out.println("🎹 Play music");
    }

    @Override
    public void onArrive() {
        playMusic();
    }
}
