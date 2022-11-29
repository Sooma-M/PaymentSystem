package com.javacode.Payment;

public class PaymentFactory {
    public Payment createPayment(String type){
        if(type.equals("Wallet"))
            return new Wallet();
        else if(type.equals("Credit Card"))
            return new CreditCard();
        else if (type.equals("Cache"))
            return new Cache();
        return null;
    }
}
