package me.leedo.designpattern.decorator;

public class Customer {
    public static void main(String[] args) {
        Beverage americano = new Americano();
        americano = new Shot(americano);
        americano = new Shot(americano);

        System.out.println("메뉴: " + americano.getName());
        System.out.println("가격: " + americano.cost());
    }
}

// ref: https://gdtbgl93.tistory.com/9