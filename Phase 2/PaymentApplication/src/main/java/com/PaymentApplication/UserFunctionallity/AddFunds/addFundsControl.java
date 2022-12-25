package com.PaymentApplication.UserFunctionallity.AddFunds;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.User;
import com.PaymentApplication.UserFunctionallity.Payment.Payment;
import com.PaymentApplication.UserFunctionallity.Payment.PaymentFactory;

import java.util.HashMap;

public class addFundsControl{
	public Double execute(HashMap m)
	{
		if (CurrentUser.getUser() == null)
			throw new IllegalArgumentException("You need to sign-in first!");

		Payment payment = PaymentFactory.createPayment("credit-card");
		payment.pay(m);
		User user = CurrentUser.getUser();
		user.getWallet().addFunds(Double.parseDouble((String) m.get("amount")));
		user.addTransaction(new Transaction("Add funds to wallet", Double.parseDouble((String) m.get("amount"))));
		return user.getWallet().getAmount();
	}
}
