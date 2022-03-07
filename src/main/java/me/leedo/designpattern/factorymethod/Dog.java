package me.leedo.designpattern.factorymethod;

public class Dog implements Animal {
    private String name;

    @Override
    public void speak() {
        System.out.println("bark");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
