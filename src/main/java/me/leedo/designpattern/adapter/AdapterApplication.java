package me.leedo.designpattern.adapter;

import me.leedo.designpattern.adapter.object.Cat;
import me.leedo.designpattern.adapter.object.Dog;
import me.leedo.designpattern.adapter.object.Fish;
import me.leedo.designpattern.adapter.object.FishAdapter;

public class AdapterApplication {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.walk();

        Dog dog = new Dog();
        dog.walk();

        // ⭐️ 문제: fish를 걷게 하고 싶다
        Fish fish = new Fish();
        // fish.walk();  // ⚠️ 당연히 에러



        // 해결방법 1: 기존 코드를 수정한다
        // 그런데 요구 사항이 계속 추가되면 기존 코드를 계속 수정해야한다. (Fish.java 파일 확인)
        // 인터페이스를 맞추기 위해 기존 코드를 계속 수정하는 게 옳은 것일까?
        // - Fish의 핵심 로직, 핵심 기능을 이해하기 힘들어진다.
        //    - 외부 인터페이스를 맞추기 위해 작성한 코드가 핵심 로직, 핵심 기능보다 더 많아질 가능성이 있다
        // - 내부 코드를 수정하지 못하는 경우도 있을 수 있다.
        // - 외부 인터페이스를 맞출 때 핵심 기능을 적당히 잘 이용하면 될 수 있지 않을까



        // 해결방법 2: 기존의 코드를 건드리지 않고 수정한다
        // 다른 인터페이스를 연결시키는 어댑터를 사용해서 문제를 해결
        FishAdapter adaptedFish = new FishAdapter(fish);
        adaptedFish.walk();  // ✅ 인터페이스가 맞춰진 fish는 걸을 수 있다



        /* 📒 정리
        Adapter Pattern은 맞지 않는 기존의 인터페이스를 현재 코드에 맞게 변환시켜주는 역할을 합니다

        ref. https://youtu.be/IHU-wDglGM0
         */

        /*
        * Java에서 <<Reader>> 인터페이스는 char[]를 읽습니다
        * 구현체로 BufferReader: char[]를 처리합니다
        * 또 다른 구현체인 InputStreamReader: char[]를 처리합니다. 이 구현체는 시스템에서 올라오는 바이트 스트림을 어댑터로 변환해줍니다
        *
        * ref. https://yaboong.github.io/design-pattern/2018/10/15/adapter-pattern/
        * */
    }
}
