package me.leedo.designpattern.proxy2;

public class ProxyPattern {
    public static void main(String[] args) {
        School school = new School(1L, "Hello World School");

        // π‘ νκ΅ μ λ³΄λ§ λΆλ¬μ€λ κ²½μ°μλ νμ μ λ³΄λ νμνμ§ μμΌλ―λ‘ νμ νλ‘μ κ°μ²΄λ₯Ό κ°μ§κ³  μμ΅λλ€.
        school.getSchoolInfo();

        // π νμ μ λ³΄κ° νμν  λ λΉλ‘μ νμ μ λ³΄λ₯Ό λ°μ΄ν°λ² μ΄μ€μμ μ‘°νν΄μ κ°μ§κ³  μ΅λλ€.
        school.getStudentInfo();
    }
}
