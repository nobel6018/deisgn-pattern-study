package me.leedo.designpattern.factorymethod2;

public class ParisBaguetteBreadFactory implements BreadFactory {
    private int giftWrappedCount = 0;

    @Override
    public Bread createBread() {
        return createBread(false); // 기본은 선물 포장 안함
    }

    public Bread createBread(boolean giftWrapped) {
        ParisBaguetteBread bread = new ParisBaguetteBread("바게뜨");
        bread.setGiftWrapped(giftWrapped);
        if (giftWrapped) {
            giftWrappedCount++;
        }

        return bread;
    }

    public int getGiftWrappedCount() {
        return giftWrappedCount;
    }
}
