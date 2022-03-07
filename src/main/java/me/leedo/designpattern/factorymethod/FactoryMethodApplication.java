package me.leedo.designpattern.factorymethod;

public class FactoryMethodApplication {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.speak();
        System.out.println("catFactory.getCatCount() = " + catFactory.getCatCount());


        DogFactory dogFactory = new DogFactory();
        Dog dog = (Dog)dogFactory.createAnimal();
        Dog dog1 = dogFactory.setName(dog, "dog1");
        System.out.println("dog1.getName() = " + dog1.getName());
    }
}
