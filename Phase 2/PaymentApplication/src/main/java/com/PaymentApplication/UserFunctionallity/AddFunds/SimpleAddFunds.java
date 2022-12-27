package com.PaymentApplication.UserFunctionallity.AddFunds;

import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.User;
import com.PaymentApplication.UserFunctionallity.Payment.PaymentWays.Payment;
import com.PaymentApplication.UserFunctionallity.Payment.PaymentFactory;

import java.util.HashMap;

public class SimpleAddFunds implements IFunds{
	public Double addFundsToWallet(HashMap m)
	{
		//check
		if (!CurrentUser.checkUser())
			throw new UserException();

		//pay
		Payment payment = PaymentFactory.createPayment("credit-card");
		payment.pay((HashMap) m.get("credit-card-info"));

		//add
		User user = CurrentUser.getUser();
		double amount = Double.parseDouble(m.get("amount").toString());
		user.getWallet().addFunds(amount);

		//save
		user.addTransaction(new Transaction("Add funds to wallet", amount));

		//return
		return user.getWallet().getBalance();
	}
}
