package me.leedo.designpattern.decorator2;

public class DoranRing extends LolItem {
    private final int additionalAttackDamage = 0;
    private final int additionalAbilityPower = 15;

    public DoranRing(LolChampion lolChampion) {
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
        return lolChampion.getName() + " + 💍도란링";
    }
}
