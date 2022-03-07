package me.leedo.designpattern.factorymethod;

public class CatFactory implements AnimalFactory {
    private int catCount = 0;

    @Override
    public Animal createAnimal() {
        catCount++;
        return new Cat();
    }

    public int getCatCount() {
        return catCount;
    }
}
