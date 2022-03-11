package me.leedo.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Command> commandList = new ArrayList<>();

    public Invoker() {
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void runCommand() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
