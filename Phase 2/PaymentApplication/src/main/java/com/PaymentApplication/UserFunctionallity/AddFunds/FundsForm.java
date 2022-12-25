package com.PaymentApplication.UserFunctionallity.AddFunds;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FundsForm {
	@PostMapping(value = "/user/add-funds")
	public String getInfoFromUser(@RequestBody HashMap m)
	{
		//send values to command
		try {
			addFundsControl add = new addFundsControl();
			double amount = add.execute(m);
			return "Success! you have now " +amount+"$ in your wallet";
		}catch (IllegalArgumentException ex) {
			return ex.getMessage();
		}
	}
}
