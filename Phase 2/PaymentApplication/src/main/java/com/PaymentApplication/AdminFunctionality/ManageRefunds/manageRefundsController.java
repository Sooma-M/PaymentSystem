package com.PaymentApplication.AdminFunctionality.ManageRefunds;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class manageRefundsController {
	@GetMapping(value = "/admin/get-refunds")
	public ResponseEntity showRefunds() {
		try {
			IRefundHandler handler = ManageRefundsFactory.createHandler("simple");
			return ResponseEntity.status(HttpStatus.OK).body("Requests: \n" + handler.getRequests().toString());
		} catch (IllegalAccessError ex) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
		}
	}
	@GetMapping(value = "/admin/manage-refund")
	public ResponseEntity manageRequest(@RequestBody HashMap m) { //id, status
		try {
			IRefundHandler handler = ManageRefundsFactory.createHandler("simple");
			handler.execute(m);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (IllegalAccessError ex) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
		}catch (IllegalArgumentException ex) {
			return ResponseEntity.status(HttpStatus.OK).body(ex.getMessage());
		}
	}

}
