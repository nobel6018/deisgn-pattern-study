package me.leedo.designpattern.command2;

public class CommandPatternApplication2 {
    public static void main(String[] args) {
        Kaisa kaisa = new Kaisa();

        GameUser faker = new GameUser();

        // 평-Q-평
        faker.addAttack(new KaisaAttackCommand(kaisa, AQWER.A));
        faker.addAttack(new KaisaAttackCommand(kaisa, AQWER.Q));
        faker.addAttack(new KaisaAttackCommand(kaisa, AQWER.A));
        faker.executeAttacks();

        // R-W-Q-동시에 평
        faker.addAttack(new KaisaAttackCommand(kaisa, AQWER.R));
        faker.addAttack(new KaisaAttackCommand(kaisa, AQWER.W));
        faker.addAttack(new KaisaAttackCommand(kaisa, AQWER.Q));
        faker.addAttack(new KaisaAttackCommand(kaisa, AQWER.A));
        faker.executeAttacks();
    }
}
