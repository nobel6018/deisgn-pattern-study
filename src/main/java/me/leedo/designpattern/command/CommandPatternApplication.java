package me.leedo.designpattern.command;

import java.util.Arrays;

public class CommandPatternApplication {
    public static void main(String[] args) {
        // 🐳 커맨드 패턴: 명령을 추상화해서 객체로 다룬다. 명령은 간단한 명령일수도, 다른 오브젝트의 action을 발생시키는 명령일수도 있다.
        // 이렇게 추상화하면 좋은 점은 명령들을 object처럼 관리할 수 있고, object를 모아두었다가 지정한 시간에 실행 가능하게 할수도 있습니다.
        Dog dog = new Dog();
        DogCommand dogCommand = new DogCommand(dog, Arrays.asList("sit", "sit", "stay"));
        dogCommand.execute();


        // invoker를 통해서 호출
        Invoker invoker = new Invoker();
        invoker.addCommand(dogCommand);

        invoker.runCommand();
    }
}
