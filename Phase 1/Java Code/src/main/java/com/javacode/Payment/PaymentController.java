package com.javacode.Payment;

import com.javacode.Controller;

import java.util.Map;

public class PaymentController implements Controller {
    Payment payment;
    public PaymentController() {
        payment = new PaymentFactory().createPayment("Credit Card");
    }

    public void execute(Map m){
        if(!m.get("way").equals("no change"))
            payment = new PaymentFactory().createPayment((String) m.get("way"));
        payment.pay((Double) m.get("amount"));
    }
}
