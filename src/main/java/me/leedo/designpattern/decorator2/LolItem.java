package me.leedo.designpattern.decorator2;

public abstract class LolItem implements LolChampion {
    LolChampion lolChampion;

    public LolItem(LolChampion lolChampion) {
        this.lolChampion = lolChampion;
    }

    abstract public String getName();
}
