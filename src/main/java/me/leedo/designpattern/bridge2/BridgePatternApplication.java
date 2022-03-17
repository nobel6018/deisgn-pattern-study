package me.leedo.designpattern.bridge2;

public class BridgePatternApplication {
    public static void main(String[] args) {
        // 게임 생성
        LoL loL = new LoL();
        Starcraft starcraft = new Starcraft();

        // 프로게이머 생성
        LolGamer faker = new LolGamer(loL);
        StarcraftGamer parkDaeHo = new StarcraftGamer(starcraft); // 노빠꾸 테란 박대호

        // 프로게이머가 게임을 합니다
        faker.gamerInfo();
        faker.playGame();
        faker.increaseWinCount();
        System.out.println("faker.getWinCount() = " + faker.getWinCount());

        parkDaeHo.gamerInfo();
        parkDaeHo.playGame();
        parkDaeHo.increaseWinCount();
        System.out.println("parkDaeHo.getWinCount() = " + parkDaeHo.getWinCount());
    }
}
