package com.javacode.Payment;

import com.javacode.discount;

import java.util.Map;

public class CreditCard implements Payment {
    @Override
    public double pay(Map m){
        double amount = (double)m.get("amount");
        if (m.containsKey("service"))
        {
            //amount = (discount)m.get("service").addDiscount(amount);
        }
        return amount;
    }
}
