package me.leedo.designpattern.observer2;

public class ObserverApplication {
    public static void main(String[] args) {
        Father father = new Father();
        SmartMoodLight smartMoodLight = new SmartMoodLight();
        SmartSpeaker smartSpeaker = new SmartSpeaker();

        // 📝 아빠 인스턴스가 변경되었을 때 통지받을 IoT를 등록합니다
        father.addIoT(smartMoodLight);
        father.addIoT(smartSpeaker);

        father.arrivedHome();
        // 💡 Turn on light
        // 🎹 Play music
    }
}
