package me.leedo.designpattern.factorymethod;

public class DogFactory implements AnimalFactory {
    private Dog dog;

    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    public void haveDog(Dog dog) {
        this.dog = dog;
    }

    public Dog setName(Dog dog, String name) {
        dog.setName(name);
        return dog;
    }
}
