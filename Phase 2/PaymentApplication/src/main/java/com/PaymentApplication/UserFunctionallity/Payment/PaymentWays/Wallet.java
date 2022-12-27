package com.PaymentApplication.UserFunctionallity.Payment.PaymentWays;

import com.PaymentApplication.Exceptions.Payment.WalletException;
import com.PaymentApplication.ServiceProvider.CurrentService;

import java.util.HashMap;

public class Wallet implements Payment {
	private double balance;

	public Wallet() {balance = 0;}

	@Override
	public void pay(HashMap m) {
		if(this.balance < (double) CurrentService.getParameters().get("amount"))
			throw new WalletException();
		this.balance -= (double)CurrentService.getParameters().get("amount");
	}

	public void addFunds(double funds) {balance += funds;}

	public double getBalance() {return balance;}

	@Override
	public String toString() {
		return "Wallet{" +
				"balance=" + balance +
				'}';
	}
}
