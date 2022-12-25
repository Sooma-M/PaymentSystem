package com.PaymentApplication.UserFunctionallity.RefundRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class RequestFundForm{
	@GetMapping(value = "/user/request-fund")
	public HashMap getTransactions() {
		HashMap m = new HashMap<>();
		try {
			m.put("status", true);
			m.put("Transactions",new RequestFundControl().getTransactions());
			return m;
		}catch (IllegalArgumentException ex) {
			m.put("status", false);
			m.put("reason", ex.getMessage());
			return m;
		}
	}
	@GetMapping(value = "/user/request-fund/{id}")
	public String getInfoFromUser(@PathVariable Integer id) {
		try {
			return new RequestFundControl().makeRequest(id);
		}
		catch (IllegalArgumentException ex){
			return ex.getMessage();
		}
	}
	@GetMapping(value = "/user/refunds")
	public HashMap getRequests() {
		HashMap m = new HashMap<>();
		try {
			m.put("status", true);
			m.put("Requests", new RequestFundControl().getRequests());
			return m;
		}
		catch (IllegalArgumentException ex) {
			m.put("status", false);
			m.put("reason", ex.getMessage());
			return m;
		}
	}
}
