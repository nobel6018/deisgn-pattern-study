package me.leedo.designpattern.proxy2;

public class ProxyPattern {
    public static void main(String[] args) {
        School school = new School(1L, "Hello World School");

        // 💡 학교 정보만 불러오는 경우에는 학생 정보는 필요하지 않으므로 학생 프록시 객체를 가지고 있습니다.
        school.getSchoolInfo();

        // 🚀 학생 정보가 필요할 때 비로소 학생 정보를 데이터베이스에서 조회해서 가지고 옵니다.
        school.getStudentInfo();
    }
}
