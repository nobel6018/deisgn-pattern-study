package me.leedo.designpattern.bridge2;

public class LolGamer extends Gamer {
    protected LolGamer(Game game) {
        super(game);
    }

    @Override
    public void gamerInfo() {
        System.out.println("롤 게임 유저입니다");
    }
}
