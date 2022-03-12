package me.leedo.designpattern.command2;

// 롤 카이사
public class Kaisa {

    // 키보드 a 입력: 평타
    public void normalAttack() {
        System.out.println("A 공격. 평타 - 기본공격👊");
    }

    // 키보드 q 입력: 이케시아 폭우
    public void icathianRain() {
        System.out.println("Q 스킬. 이케시아 폭우 - 미사일🚀");
    }

    // 키보드 w 입력: 공허추적자
    public void voidSeeker() {
        System.out.println("W 스킬. 공허추적자 - 레이저⚡️");
    }

    // 키보드 e 입력: 고속 충전
    public void supercharger() {
        System.out.println("E 스킬. 고속 충전 - 공격 속도🔥");
    }

    // 키보드 r 입력: 사냥본능
    public void killerInstinct() {
        System.out.println("R 스킬. 사냥본능 - 순간 이동💥");
    }
}
