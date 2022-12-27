package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.Exceptions.RequestBodyException;

import java.util.HashMap;

public class CreditCard implements Payment {
    @Override
    public void pay(HashMap m) {
		if (!m.containsKey("number") || !m.containsKey("password"))
			throw new RequestBodyException();
		String num = (String) m.get("number");
		String pw = (String) m.get("password");
	}
}
