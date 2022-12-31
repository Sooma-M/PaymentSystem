package com.PaymentApplication.UserFunctionallity.Payment;

import java.util.HashMap;

public class Cache implements PaymentWay {
    @Override
    public void pay(HashMap m){
        if (m.containsKey("address")) {
            String addr = (String) m.get("address");
        } else
            throw new IllegalArgumentException("You need to send correct arguments in body!");
    }
}
