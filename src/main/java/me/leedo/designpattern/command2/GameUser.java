package me.leedo.designpattern.command2;

import java.util.ArrayList;
import java.util.List;

// invoker 역할입니다.
public class GameUser {
    private final List<AttackCommand> attackCommands = new ArrayList<>();

    public GameUser() {
    }

    public void addAttackCommand(AttackCommand attackCommand) {
        attackCommands.add(attackCommand);
    }

    public void executeAttackCommands() {
        for (AttackCommand attackCommand : attackCommands) {
            attackCommand.attack();
        }
    }
}
