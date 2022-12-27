package com.PaymentApplication.UserFunctionallity.AddFunds;

import com.PaymentApplication.Exceptions.Sign.SignException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FundController {
	@PostMapping(value = "/user/add-funds")
	public String askToAddFunds(@RequestBody HashMap m) //amount, credit-card-info:{number, password}
	{
		try {
			IFunds add = FundsFactory.createFunds("simple");
			double amount = add.addFundsToWallet(m);
			return "Success! you have now " +amount+"$ in your wallet";
		}catch (SignException ex) {
			return ex.getMessage();
		}
	}
}
