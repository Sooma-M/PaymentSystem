package com.PaymentApplication.AdminFunctionality.ManageRefunds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class manageRefundsController {
	@GetMapping(value = "/admin/get-refunds")
	public String showRefunds() {
		try {
			IRefundHandler handler = ManageRefundsFactory.createHandler("simple");
			return "Transactions: \n" + handler.getRequests().toString();
		} catch (IllegalArgumentException ex) {
			return ex.getMessage();
		}
	}
	@GetMapping(value = "/admin/manage-refund")
	public String manageRequest(@RequestBody HashMap m) { //id, status
		try {
			IRefundHandler handler = ManageRefundsFactory.createHandler("simple");
			handler.execute(m);
			return "Success";
		} catch (IllegalArgumentException ex) {
			return ex.getMessage();
		}
	}

}
