package com.PaymentApplication.UserFunctionallity.AddFunds;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.Transaction;
import com.PaymentApplication.User.User;
import com.PaymentApplication.UserFunctionallity.Payment.PaymentWay;
import com.PaymentApplication.UserFunctionallity.Payment.PaymentFactory;

import java.util.HashMap;

public class SimpleAddFunds implements IFunds{
	public Double addFundsToWallet(HashMap m)
	{
		//check
		CurrentUser.checkUser();

		//pay
		PaymentWay payment = PaymentFactory.createPaymentWay("credit-card");
		payment.pay((HashMap) m.get("credit-card-info"));

		//add
		User user = CurrentUser.getUser();
		double amount = Double.parseDouble(m.get("amount").toString());
		user.getWallet().addFunds(amount);

		//save
		user.addWalletTransaction(new Transaction("Add funds to wallet", amount));

		//return
		return user.getWallet().getBalance();
	}
}
