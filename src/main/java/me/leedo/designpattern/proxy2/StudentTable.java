package me.leedo.designpattern.proxy2;

import java.util.List;

public class StudentTable {

    public List<Student> findBySchoolId(Long schoolId) {
        if (schoolId == 1) {
            return List.of(
                new Student(1L, "1번 학생"),
                new Student(2L, "2번 학생"),
                new Student(3L, "3번 학생")
            );
        } else if (schoolId == 2) {
            return List.of(
                new Student(4L, "4번 학생"),
                new Student(5L, "5번 학생")
            );
        } else {
            throw new RuntimeException("해당하는 학교가 존재하지 않습니다");
        }
    }
}
