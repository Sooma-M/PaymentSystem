package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.Exceptions.RequestBodyException;

import java.util.HashMap;

public class Cache implements Payment {
    @Override
    public void pay(HashMap m){
        if (m.containsKey("address")) {
            String addr = (String) m.get("address");
        } else
            throw new RequestBodyException();
    }
}
