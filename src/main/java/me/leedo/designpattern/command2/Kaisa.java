package me.leedo.designpattern.command2;

// 롤 카이사
public class Kaisa {

    // a: 평타
    public void normalAttack() {
        System.out.println("A 공격. 평타 - 기본공격👊");
    }

    // q: 이케시아 폭우
    public void icathianRain() {
        System.out.println("Q 스킬. 이케시아 폭우 - 미사일🚀");
    }

    // w: 공허추적자
    public void voidSeeker() {
        System.out.println("W 스킬. 공허추적자 - 레이저⚡️");
    }

    // e: 고속 충전
    public void supercharger() {
        System.out.println("E 스킬. 고속 충전 - 공격 속도🔥");
    }

    // r: 사냥본능
    public void killerInstinct() {
        System.out.println("R 스킬. 사냥본능 - 순간 이동💥");
    }
}
