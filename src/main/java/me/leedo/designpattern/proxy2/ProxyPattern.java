package me.leedo.designpattern.proxy2;

public class ProxyPattern {
    public static void main(String[] args) {
        School school1 = new School(1L, "Hello 학교");
        School school2 = new School(2L, "World 학교");

        // 학교 정보만 불러오는 경우에는 학생 정보는 필요하지 않으므로 학생을 lazy loading 합니다
        school1.getSchoolInfo();

        // 학생 정보가 필요할 때 비로소 학생 정보를 loading 합니다
        school1.getStudentInfo();

    }
}
