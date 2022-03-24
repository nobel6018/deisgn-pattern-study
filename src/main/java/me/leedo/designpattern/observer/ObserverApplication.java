package me.leedo.designpattern.observer;

// 기상청 예제 -> 기상청에서 날씨 변화 공지 -> 어플에서 변화 감지
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
