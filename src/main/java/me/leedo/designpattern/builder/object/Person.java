package me.leedo.designpattern.builder.object;

public class Person {
    private final String name;
    private final int age;
    private final String favoriteColor;

    public Person(String name, int age, String favoriteColor) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    // builder 함수 (static 함수임을 유의)
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    // 빌더 내부 함수 (내부 변수들 설정 함수, build 함수)
    public static class PersonBuilder {
        private String name;
        private int age;
        private String favoriteColor;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder favoriteColor(String favoriteColor) {
            this.favoriteColor = favoriteColor;
            return this;
        }

        public Person build() {
            return new Person(name, age, favoriteColor);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", favoriteColor='" + favoriteColor + '\'' +
            '}';
    }
}