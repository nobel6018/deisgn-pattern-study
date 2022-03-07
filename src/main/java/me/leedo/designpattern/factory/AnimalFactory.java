package me.leedo.designpattern.factory;

public class AnimalFactory {
    public Animal createAnimal(AnimalType animal) {
        switch (animal) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                throw new RuntimeException("invalid animal type");
        }
    }
}

enum AnimalType {
    CAT,
    DOG,
}
