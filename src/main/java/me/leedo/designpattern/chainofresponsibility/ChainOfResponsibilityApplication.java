package me.leedo.designpattern.chainofresponsibility;

import me.leedo.designpattern.chainofresponsibility.dto.PaymentRequest;
import me.leedo.designpattern.chainofresponsibility.dto.PaymentType;

public class ChainOfResponsibilityApplication {
    public static void main(String[] args) {
        CashHandler cashHandler = new CashHandler();
        CreditCardHandler creditCardHandler = new CreditCardHandler();
        KakaoPayHandler kakaoPayHandler = new KakaoPayHandler();

        // π³ λ€μ μμλ‘ μ²λ¦¬ν¨: cash -> credit card -> kakao pay
        cashHandler.setNextHandler(creditCardHandler);
        creditCardHandler.setNextHandler(kakaoPayHandler);


        // π μμ²­ 1: νκΈ, 10_000μ
        PaymentRequest paymentRequest1 = new PaymentRequest(PaymentType.CASH, 10_000);

        System.out.println("μ²«λ²μ§Έ μμ²­: νκΈ, 10_000μ");
        cashHandler.handle(paymentRequest1);

        // π μμ²­ 2: μ μ©μΉ΄λ, 20_000μ
        PaymentRequest paymentRequest2 = new PaymentRequest(PaymentType.CREDIT_CARD, 20_000);

        System.out.println("λλ²μ§Έ μμ²­: μ μ©μΉ΄λ, 20_000μ");
        cashHandler.handle(paymentRequest2);

        // π μμ²­ 3: μΉ΄μΉ΄μ€νμ΄, 30_000μ
        PaymentRequest paymentRequest3 = new PaymentRequest(PaymentType.KAKAO_PAY, 30_000);

        System.out.println("λλ²μ§Έ μμ²­: μΉ΄μΉ΄μ€νμ΄, 30_000μ");
        cashHandler.handle(paymentRequest3);
    }
}
