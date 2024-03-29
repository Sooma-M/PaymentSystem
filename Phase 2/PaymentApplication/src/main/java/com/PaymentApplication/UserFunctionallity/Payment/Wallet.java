package com.PaymentApplication.UserFunctionallity.Payment;

import com.PaymentApplication.ServiceProvider.CurrentService;

import java.util.HashMap;

public class Wallet implements PaymentWay {
	private double balance;

	public Wallet() {balance = 0;}

	@Override
	public void pay(HashMap m) {
		if(this.balance < Double.parseDouble(m.get("amount").toString()))
			throw new IllegalArgumentException("Failed! you didn't have enough money in your wallet!");
		this.balance -= Double.parseDouble(m.get("amount").toString());
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
