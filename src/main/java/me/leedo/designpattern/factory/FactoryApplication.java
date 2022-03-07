package me.leedo.designpattern.factory;

public class FactoryApplication {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.createAnimal(AnimalType.DOG);
        dog.speak();

        Animal cat = animalFactory.createAnimal(AnimalType.CAT);
        cat.speak();
    }
}
