package com.PaymentApplication.UserFunctionallity.RefundRequest;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class RefundRequestController {
	private IRefund control;

	public RefundRequestController(){
		control = RefundRequestFactory.createRefund("simple");
	}

	@PostMapping(value = "/user/refund-request")
	public ResponseEntity makeRequest(@RequestBody HashMap m) { //service-name, amount
		try {
			control.makeRequest(m);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch (IllegalAccessError ex){
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
		}catch (IllegalArgumentException ex){
			return ResponseEntity.status(HttpStatus.OK).body(ex.getMessage());
		}
	}

	@GetMapping(value = "/user/refund-requests")
	public ResponseEntity getRequests() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body("Requests: \n" + control.getRequests().toString());
		}catch (IllegalAccessError ex) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
		}
	}
}
