package me.leedo.designpattern.factorymethod2;

public class ParisBaguetteBread implements Bread {
    private final String name;
    private boolean giftWrapped;

    public ParisBaguetteBread(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("파바 빵: " + name);
    }

    public void setGiftWrapped(boolean giftWrapped) {
        this.giftWrapped = giftWrapped;
    }
}
