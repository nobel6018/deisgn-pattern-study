package me.leedo.designpattern.adapter.object;

public class FishAdapter implements Animal {

    private Fish fish;

    public FishAdapter(Fish fish) {
        this.fish = fish;
    }

    @Override
    public void walk() {
        fish.swim();
    }
}
