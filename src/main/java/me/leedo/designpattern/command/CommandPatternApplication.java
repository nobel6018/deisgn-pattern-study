package me.leedo.designpattern.command;

import java.util.Arrays;

public class CommandPatternApplication {
    public static void main(String[] args) {
        // ๐ณ ์ปค๋งจ๋ ํจํด: ๋ช๋ น์ ์ถ์ํํด์ ๊ฐ์ฒด๋ก ๋ค๋ฃฌ๋ค. ๋ช๋ น์ ๊ฐ๋จํ ๋ช๋ น์ผ์๋, ๋ค๋ฅธ ์ค๋ธ์ ํธ์ action์ ๋ฐ์์ํค๋ ๋ช๋ น์ผ์๋ ์๋ค.
        // ์ด๋ ๊ฒ ์ถ์ํํ๋ฉด ์ข์ ์ ์ ๋ช๋ น๋ค์ object์ฒ๋ผ ๊ด๋ฆฌํ  ์ ์๊ณ , object๋ฅผ ๋ชจ์๋์๋ค๊ฐ ์ง์ ํ ์๊ฐ์ ์คํ ๊ฐ๋ฅํ๊ฒ ํ ์๋ ์์ต๋๋ค.
        Dog dog = new Dog();
        DogCommand dogCommand = new DogCommand(dog, Arrays.asList("sit", "sit", "stay"));
        dogCommand.execute();


        // invoker๋ฅผ ํตํด์ ํธ์ถ
        Invoker invoker = new Invoker();
        invoker.addCommand(dogCommand);

        invoker.runCommand();
    }
}
