package me.leedo.designpattern.decorator2;

public class Kaisa implements LolChampion {
    private int attackDamage = 32;
    private int abilityPower = 30;

    public Kaisa() {
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
        return "Kaisa";
    }
}
