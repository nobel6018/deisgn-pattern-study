package me.leedo.designpattern.proxy2;

import java.util.List;

public class School {
    private final Long id;
    private final String name;
    private final StudentListProxy studentListProxy;

    public School(Long id, String name) {
        this.id = id;
        this.name = name;
        studentListProxy = new StudentListProxy(id);
    }

    public void getSchoolInfo() {
        System.out.println("id= " + id + ", name= " + name);
    }

    public void getStudentInfo() {
        List<Student> students = this.studentListProxy.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
