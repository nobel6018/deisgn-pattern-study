package me.leedo.designpattern.command;

import java.util.List;

public class DogCommand implements Command {
    private final Dog dog;

    private final List<String> commands;

    public DogCommand(Dog dog, List<String> commands) {
        this.dog = dog;
        this.commands = commands;
    }

    public void execute() {
        for (String command : commands) {
            if (command.equals("sit")) {
                dog.sit();
            } else if (command.equals("stay")) {
                dog.stay();
            }
        }
    }
}
