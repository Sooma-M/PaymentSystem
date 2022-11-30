package com.javacode.Payment;

import com.javacode.Command;

import java.util.Map;

public class PaymentCommand implements Command {
    Payment payment;
    public PaymentCommand() {
        payment = new PaymentFactory().createPayment("Credit Card");
    }
    public void execute(Map m){
        if(!m.get("way").equals("no change"))
            payment = new PaymentFactory().createPayment((String) m.get("way"));
        payment.pay((Double) m.get("amount"));
    }
}
