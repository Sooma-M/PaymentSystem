package com.PaymentApplication.UserFunctionallity.Payment;

import java.util.HashMap;

public class CreditCard implements PaymentWay {
    @Override
    public void pay(HashMap m) {
		if (!m.containsKey("number") || !m.containsKey("password"))
			throw new IllegalArgumentException("You need to send correct arguments in body!");
		String num = (String) m.get("number");
		String pw = (String) m.get("password");
	}
}
