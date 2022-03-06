package me.leedo.designpattern.chainofresponsibility;

import me.leedo.designpattern.chainofresponsibility.dto.PaymentRequest;
import me.leedo.designpattern.chainofresponsibility.dto.PaymentType;

public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {
        CashHandler cashHandler = new CashHandler();
        CreditCardHandler creditCardHandler = new CreditCardHandler();
        KakaoPayHandler kakaoPayHandler = new KakaoPayHandler();

        // 🐳 다음 순서로 처리함: cash -> credit card -> kakao pay
        cashHandler.setNextHandler(creditCardHandler);
        creditCardHandler.setNextHandler(kakaoPayHandler);


        // 👏 요청 1: 현금, 10_000원
        PaymentRequest paymentRequest1 = new PaymentRequest(PaymentType.CASH, 10_000);

        System.out.println("첫번째 요청: 현금, 10_000원");
        cashHandler.handle(paymentRequest1);

        // 👏 요청 2: 신용카드, 20_000원
        PaymentRequest paymentRequest2 = new PaymentRequest(PaymentType.CREDIT_CARD, 20_000);

        System.out.println("두번째 요청: 신용카드, 20_000원");
        cashHandler.handle(paymentRequest2);

        // 👏 요청 3: 카카오페이, 30_000원
        PaymentRequest paymentRequest3 = new PaymentRequest(PaymentType.KAKAO_PAY, 30_000);

        System.out.println("두번째 요청: 카카오페이, 30_000원");
        cashHandler.handle(paymentRequest3);
    }
}
