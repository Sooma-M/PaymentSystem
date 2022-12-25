package com.PaymentApplication.UserFunctionallity.Payment;

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
			throw new IllegalArgumentException("Failed! you didn't have enough money in your wallet!");
		this.amount -= amount;
	}

	public void addFunds(double funds) {
		amount += funds;
	}

	public double getAmount() {return amount;}
}
