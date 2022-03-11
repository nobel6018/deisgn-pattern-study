package me.leedo.designpattern.command;

import java.util.Arrays;

public class CommandPatternApplication {
    public static void main(String[] args) {
        // 🐳 커맨드 패턴: 명령을 추상화해서 객체로 다룬다

        Dog dog = new Dog();
        DogCommand dogCommand = new DogCommand(dog, Arrays.asList("sit", "sit", "stay"));
        dogCommand.execute();


        // invoker를 통해서 호출
        Invoker invoker = new Invoker();
        invoker.addCommand(dogCommand);

        invoker.runCommand();
    }
}
