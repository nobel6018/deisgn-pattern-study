package me.leedo.designpattern.builder;

import me.leedo.designpattern.builder.object.Person;
import me.leedo.designpattern.builder.object.PersonBySetter;
import me.leedo.designpattern.builder.object.PersonLombok;

public class BuilderPatternApplication {

    public static void main(String[] args) {

        Person leedo = Person.builder()
            .name("이도")
            .age(29)
            .favoriteColor("Sea Blue")
            .build();

        System.out.println("leedo = " + leedo);

        PersonBySetter user = new PersonBySetter();
        user.setAge(10);

        // 유저를 저장하는 로직
        PersonLombok personLombok = PersonLombok.builder("이도")
            .age(29)
            .build();
        System.out.println("personLombok = " + personLombok);

    }
}
