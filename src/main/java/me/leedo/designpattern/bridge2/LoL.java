package me.leedo.designpattern.bridge2;

public class LoL implements Game {
    @Override
    public void gameInfo() {
        System.out.println("League of Legend");
    }

    @Override
    public void playGame() {
        System.out.println("페이커 급 무빙. 롤 중 🔥");
    }
}
