package me.leedo.designpattern.proxy2;

public class Student {
    private Long id;
    private String name;
    private School school;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
