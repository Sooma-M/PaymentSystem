package com.javacode;

import java.util.Map;

public class Wallet implements Payment {
	private double amount = 0;
	private Command command;

	@Override
	public int pay(Map m) {
		try {
			command.execute(m);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	public void addFunds(CreditCard card, double funds) {
		amount += funds;
	}
}
