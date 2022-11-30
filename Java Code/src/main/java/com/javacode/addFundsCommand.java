package com.javacode;

import java.util.Map;

import com.javacode.Model.CurrentUser;
import com.javacode.Payment.CreditCard;

public class addFundsCommand implements Command {

	@Override
	public void execute(Map m) {
		CreditCard creditCard = new CreditCard();
		CurrentUser.getUser().getWallet().addFunds(creditCard, (double) m.get("amount"));
	}

}
