package me.leedo.designpattern.chainofresponsibility;

import me.leedo.designpattern.chainofresponsibility.dto.PaymentRequest;
import me.leedo.designpattern.chainofresponsibility.dto.PaymentType;

public class KakaoPayHandler implements PaymentHandler {

    private PaymentHandler nextHandler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handle(PaymentRequest paymentRequest) {
        if (paymentRequest.getPaymentType() == PaymentType.KAKAO_PAY) {
            System.out.println("KakaoPayHandler received " + paymentRequest.getAmount());
            return;
        }

        if (nextHandler != null) {
            nextHandler.handle(paymentRequest);
        }
    }
}
