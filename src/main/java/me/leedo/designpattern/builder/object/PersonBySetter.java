package me.leedo.designpattern.builder.object;

public class PersonBySetter {

    private String name;
    private int age;
    private String favoriteColor;

    public PersonBySetter() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
