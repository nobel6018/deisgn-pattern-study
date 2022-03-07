package me.leedo.designpattern.observer;

public class ObserverApplication {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Owner owner = new Owner();
        owner.register(cat);
        owner.register(dog);

        owner.arrivedHome();
    }
}
