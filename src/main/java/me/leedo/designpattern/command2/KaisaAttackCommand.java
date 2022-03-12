package me.leedo.designpattern.command2;

public class KaisaAttackCommand implements Attack {
    private final Kaisa kaisa;
    private final AQWER keyboardInput;

    public KaisaAttackCommand(Kaisa kaisa, AQWER keyboardInput) {
        this.kaisa = kaisa;
        this.keyboardInput = keyboardInput;
    }

    @Override
    public void attack() {
        switch (keyboardInput) {
            case A:
                kaisa.normalAttack();
                break;
            case Q:
                kaisa.icathianRain();
                break;
            case W:
                kaisa.voidSeeker();
                break;
            case E:
                kaisa.supercharger();
                break;
            case R:
                kaisa.killerInstinct();
                break;
        }
    }
}