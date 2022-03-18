package me.leedo.designpattern.singleton;

public class SingletonPatternApplication {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);

        // 인스턴스 변수를 공유하기 때문에 조심해서 불변하게 사용하거나 조심해서 사용해야 한다
        // 사용시 주의: instance1에서 사용 중인데 그 사이에 instance2가 동시에 사용하면 예상치 못한 결과가 발생할 수 있다.

        instance1.setNumber(10);

        // instance2가 동시에 접근해서 사용
        instance2.setNumber(20);

        // instance1은 숫자 10을 기대
        if (instance1.getNumber() == 10) {
            System.out.println("👍 기대값 10과 같음");
        } else {
            System.out.println("👊️ 기대값 10과 다름");
        }
    }
}
