package me.leedo.designpattern.command2;

public class CommandPatternApplication2 {
    public static void main(String[] args) {
        Kaisa kaisa = new Kaisa();

        GameUser faker = new GameUser();

        // R-W-Q-동시에 평
        faker.addAttackCommand(new KaisaAttackCommand(kaisa, AQWER.R));
        faker.addAttackCommand(new KaisaAttackCommand(kaisa, AQWER.W));
        faker.addAttackCommand(new KaisaAttackCommand(kaisa, AQWER.Q));
        faker.addAttackCommand(new KaisaAttackCommand(kaisa, AQWER.A));
        faker.executeAttackCommands();

        /*
        * R 스킬. 사냥본능 - 순간 이동💥
        * W 스킬. 공허추적자 - 레이저⚡️
        * Q 스킬. 이케시아 폭우 - 미사일🚀
        * A 공격. 평타 - 기본공격👊
        * */
    }
}
