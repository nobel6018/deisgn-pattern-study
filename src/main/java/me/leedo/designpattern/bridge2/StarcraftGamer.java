package me.leedo.designpattern.bridge2;

public class StarcraftGamer extends Gamer {
    protected StarcraftGamer(Game game) {
        super(game);
    }

    @Override
    public void gamerInfo() {
        System.out.println("스타크래프트 게임 유저입니다");
    }
}
