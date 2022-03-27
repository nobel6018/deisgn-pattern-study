package me.leedo.designpattern.decorator2;

public class Manamune extends LolItem {
    private final int additionalAttackDamage = 35;
    private final int additionalAbilityPower = 0;

    public Manamune(LolChampion lolChampion) {
        super(lolChampion);
    }

    @Override
    public int getAttackDamage() {
        return lolChampion.getAttackDamage() + additionalAttackDamage;
    }

    @Override
    public int getAbilityPower() {
        return lolChampion.getAbilityPower() + additionalAbilityPower;
    }

    @Override
    public String getName() {
        return lolChampion.getName() + " + 🗡마나무네";
    }
}
