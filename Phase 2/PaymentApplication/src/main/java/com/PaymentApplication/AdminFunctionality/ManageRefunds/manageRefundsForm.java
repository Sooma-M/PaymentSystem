package com.PaymentApplication.AdminFunctionality.ManageRefunds;

import com.PaymentApplication.Exceptions.Sign.SignException;
import com.PaymentApplication.UserFunctionallity.RefundRequest.RequestFundControl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class manageRefundsForm{
	@GetMapping(value = "/admin/get-refunds")
	public HashMap showRefunds() {
		HashMap m = new HashMap<>();
		try {
			m.put("status", true);
			m.put("Transactions", new manageRefundsController().getRequests());
			return m;
		} catch (SignException ex) {
			m.put("status", false);
			m.put("reason", ex.getMessage());
			return m;
		}
	}
	@GetMapping(value = "/admin/manage-refund")
	/*id, status*/
	public String manageRequest(@RequestBody HashMap m) {
		try {
			manageRefundsController c = new manageRefundsController();
			c.execute(m);
			return "Success";
		} catch (SignException ex) {
			return ex.getMessage();
		}
	}

}
