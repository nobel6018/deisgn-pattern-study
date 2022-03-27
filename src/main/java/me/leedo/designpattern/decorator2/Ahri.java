package me.leedo.designpattern.decorator2;

public class Ahri implements LolChampion {
    private int attackDamage = 30;
    private int abilityPower = 34;

    public Ahri() {
    }

    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getAbilityPower() {
        return abilityPower;
    }

    @Override
    public String getName() {
        return "Ahri";
    }
}
