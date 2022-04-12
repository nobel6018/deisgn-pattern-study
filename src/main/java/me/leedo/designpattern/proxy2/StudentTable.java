package me.leedo.designpattern.proxy2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentTable {

    List<Student> students = List.of(
        new Student(1L, "1번 학생", 1L),
        new Student(2L, "2번 학생", 1L),
        new Student(3L, "3번 학생", 1L),
        new Student(4L, "4번 학생", 2L),
        new Student(5L, "5번 학생", 2L)
    );

    public List<Student> findBySchoolId(Long schoolId) {
        return students.stream().filter(it -> Objects.equals(it.getSchoolId(), schoolId)).collect(Collectors.toList());
    }
}
