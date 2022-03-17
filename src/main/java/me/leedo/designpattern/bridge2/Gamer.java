package me.leedo.designpattern.bridge2;

public abstract class Gamer {
    private Game game;
    private int winCount;

    protected Gamer(Game game) {
        this.game = game;
    }

    public abstract void gamerInfo();
    public void gameInfo() {
        game.gameInfo();
    }
    public void playGame() {
        game.playGame();
    }

    public int getWinCount() {
        return winCount;
    }

    public void increaseWinCount() {
        winCount++;
    }
}
