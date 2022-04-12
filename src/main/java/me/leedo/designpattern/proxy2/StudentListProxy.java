package me.leedo.designpattern.proxy2;

import java.util.List;

public class StudentListProxy {
    private List<Student> students;
    private final Long schoolId;
    private final StudentTable studentTable;

    public StudentListProxy(Long schoolId) {
        this.schoolId = schoolId;
        studentTable = new StudentTable();
    }

    public List<Student> getStudents() {
        if (students == null) {
            return studentTable.findBySchoolId(schoolId);
        }
        return students;
    }
}
