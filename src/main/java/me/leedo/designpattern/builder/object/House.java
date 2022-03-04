package me.leedo.designpattern.builder.object;

import lombok.ToString;

import java.util.ArrayList;

@ToString
public class House {

    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Door> doors;

    // 생성자
    public House(String name, ArrayList<Room> rooms, ArrayList<Door> doors) {
        this.name = name;
        this.rooms = rooms;
        this.doors = doors;
    }

    // 빌더 함수
    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    // 빌더 내부 함수
    public static class HouseBuilder {
        private String name;
        private ArrayList<Room> rooms;
        private ArrayList<Door> doors;

        private HouseBuilder() {
        }

        public HouseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HouseBuilder room(Room room) {
            this.rooms.add(room);
            return this;
        }

        public HouseBuilder door(Door door) {
            this.doors.add(door);
            return this;
        }

        // public HouseBuilder attachDoor() {
        //
        // }

        public House build() {
            return new House(this.name, this.rooms, this.doors);
        }
    }
}
