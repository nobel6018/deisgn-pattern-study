package me.leedo.designpattern.observer2;

public class ObserverApplication {
    public static void main(String[] args) {
        Father father = new Father();
        SmartMoodLight smartMoodLight = new SmartMoodLight();
        SmartSpeaker smartSpeaker = new SmartSpeaker();

        // π μλΉ  μΈμ€ν΄μ€κ° λ³κ²½λμμ λ ν΅μ§λ°μ IoTλ₯Ό λ±λ‘ν©λλ€
        father.addIoT(smartMoodLight);
        father.addIoT(smartSpeaker);

        father.arrivedHome();
        // π‘ Turn on light
        // πΉ Play music
    }
}
