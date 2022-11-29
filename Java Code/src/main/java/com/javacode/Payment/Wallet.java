package com.javacode.Payment;

import java.util.Map;

public class Wallet implements Payment{
    private double amount;
    public Wallet()
    {
        amount = 0;
    }
    @Override
    public double pay(Map m){
        amount -= (double)m.get("amount");
        return 0;
    }

    public void addFunds(Map m){
        try {
            Payment pay = new PaymentFactory().createPayment("Credit Card");
            pay.pay(m);
            amount += (double)m.get("amount");
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
}
