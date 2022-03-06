package me.leedo.designpattern.chainofresponsibility;

import me.leedo.designpattern.chainofresponsibility.dto.PaymentRequest;

public interface PaymentHandler {
    void setNextHandler(PaymentHandler handler);

    void handle(PaymentRequest req);
}
