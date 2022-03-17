package me.leedo.designpattern.bridge2;

public class Starcraft implements Game {
    @Override
    public void gameInfo() {
        System.out.println("한국 민속놀이 스타크래프트");
    }

    @Override
    public void playGame() {
        System.out.println("스타 빡겜 중 🔥");
    }
}
