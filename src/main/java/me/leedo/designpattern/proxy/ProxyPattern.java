package me.leedo.designpattern.proxy;

// ref: https://velog.io/@newtownboy/%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4-%ED%94%84%EB%A1%9D%EC%8B%9C%ED%8C%A8%ED%84%B4Proxy-Pattern
public class ProxyPattern {
    public static void main(String[] args) {
        ProxyImage starryNight = new ProxyImage("Van Gogh - Starry Night");
        ProxyImage venus = new ProxyImage("Milo - Venus");

        starryNight.display();
        venus.display();
    }
}
