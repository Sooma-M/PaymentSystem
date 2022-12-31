package com.PaymentApplication.UserFunctionallity.RefundRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class RefundRequestController {
	private IRefund control;

	public RefundRequestController(){
		control = RefundRequestFactory.createRefund("simple");
	}

	@GetMapping(value = "/user/transactions")
	public String getTransactions() {
		try {
			return "Transactions: " + control.getTransactions().toString();
		}catch (IllegalArgumentException ex) {
			return ex.getMessage();
		}
	}

	@PostMapping(value = "/user/refund-request")
	public String makeRequest(@RequestBody HashMap m) { //service-name, amount
		try {
			return control.makeRequest(m);
		}
		catch (IllegalArgumentException ex){
			return ex.getMessage();
		}
	}

	@GetMapping(value = "/user/refund-requests")
	public String getRequests() {
		try {
			return "Requests: " + control.getRequests().toString();
		}catch (IllegalArgumentException ex) {
			return ex.getMessage();
		}
	}
}
