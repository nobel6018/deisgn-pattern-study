package me.leedo.designpattern.proxy;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("로딩: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("이미지 표시: " + fileName);
    }
}
