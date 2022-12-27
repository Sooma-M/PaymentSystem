package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.Exceptions.Payment.WalletException;
import com.PaymentApplication.ServiceProvider.CurrentService;

import java.util.HashMap;

public class Wallet implements Payment {
	private double amount;

	public Wallet()
	{
		amount = 0;
	}
	@Override
	public void pay(HashMap m) {
		if(this.amount < (double) CurrentService.getParameters().get("amount"))
			throw new WalletException();
		this.amount -= amount;
	}

	public void addFunds(double funds) {
		amount += funds;
	}

	public double getAmount() {return amount;}
}
