package com.PaymentApplication.UserFunctionallity.AddFunds;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FundController {
	@PostMapping(value = "/user/add-funds")
	public ResponseEntity askToAddFunds(@RequestBody HashMap m) //amount, credit-card-info:{number, password}
	{
		try {
			IFunds add = FundsFactory.createFunds("simple");
			double amount = add.addFundsToWallet(m);
			return ResponseEntity.status(HttpStatus.OK).body("Success! you have now " +amount+"$ in your wallet");
		}catch (IllegalArgumentException ex) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
		}catch (IllegalAccessError ex) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
		}
	}
}
