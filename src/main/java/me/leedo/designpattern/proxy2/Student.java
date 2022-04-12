package me.leedo.designpattern.proxy2;

public class Student {
    private final Long id;
    private final String name;
    private final Long schoolId;

    public Student(Long id, String name, Long schoolId) {
        this.id = id;
        this.name = name;
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }

    public Long getSchoolId() {
        return schoolId;
    }
}
