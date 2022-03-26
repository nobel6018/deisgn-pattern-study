package me.leedo.designpattern.facade;

public class FacadeApplication {
    public static void main(String[] args) {

        // A driver wants to go forward (without facade)
        /*
        * 1. 압력센서(가속패달)에 전원을 연결한다
        * 2. 모터에 전원을 연결한다
        * 3. 압력센서를 활성화시킨다
        * 4. 모터에게 회전 명령을 내린다.
        * */

        // 👊 매번 같은 작업을 반복하는 것이 불필요하고
        // 🙊 앞으로 가는 명령만 내리고 싶고 내부 구현은 궁금하지 않다
        // 그래서 Facade 패턴을 사용해서 자동차를 앞으로 가도록 한다. (facade: 건물 외관)

        CarFacade carFacade = new CarFacade();
        carFacade.goForward();
    }
}
