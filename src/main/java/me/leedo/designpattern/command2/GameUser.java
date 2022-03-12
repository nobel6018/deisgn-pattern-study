package me.leedo.designpattern.command2;

import java.util.ArrayList;
import java.util.List;

// invoker 역할입니다.
public class GameUser {
    private final List<Attack> attacks = new ArrayList<>();

    public GameUser() {
    }

    public void addAttack(Attack attack) {
        attacks.add(attack);
    }

    public void executeAttacks() {
        for (Attack attack : attacks) {
            attack.attack();
        }
    }
}
