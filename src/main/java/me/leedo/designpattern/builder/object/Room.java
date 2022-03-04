package me.leedo.designpattern.builder.object;

public class Room {
    private String name;
    private Door door;

    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public Room(String name, Door door) {
        this.name = name;
        this.door = door;
    }
}

