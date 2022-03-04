package me.leedo.designpattern.builder.object;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder(builderMethodName = "requiredArgBuilder")
@ToString
@Getter
public class PersonLombok {
    private final String name;
    private int age;
    private String favoriteColor;

    public static PersonLombokBuilder builder(String name) {
        return requiredArgBuilder().name(name);
    }
}
