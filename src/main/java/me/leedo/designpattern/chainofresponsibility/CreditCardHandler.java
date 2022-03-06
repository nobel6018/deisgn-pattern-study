package me.leedo.designpattern.chainofresponsibility;

import me.leedo.designpattern.chainofresponsibility.dto.PaymentRequest;
import me.leedo.designpattern.chainofresponsibility.dto.PaymentType;

public class CreditCardHandler implements PaymentHandler {

    private PaymentHandler nextHandler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handle(PaymentRequest paymentRequest) {
        if (paymentRequest.getPaymentType() == PaymentType.CREDIT_CARD) {
            System.out.println("CreditCardHandler received " + paymentRequest.getAmount());
            return;
        }

        if (nextHandler != null) {
            nextHandler.handle(paymentRequest);
        }
    }
}
