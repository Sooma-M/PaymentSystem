package com.PaymentApplication.UserFunctionallity.Payment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PaymentController {

    @PostMapping(value = {"/user/pay", "/user/pay/{way}"}) //credit-card, wallet, cache
    public ResponseEntity<String> payForService(@PathVariable(required = false) String way, @RequestBody HashMap m) {
        try {
            if (way == null) way = "credit-card"; //default
            IPayment payment = PaymentFactory.createPayment("simple");
            return ResponseEntity.status(HttpStatus.OK).body(payment.payForService(way, m));
        }catch (IllegalAccessError ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
        }catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.OK).body(ex.getMessage());
        }catch (IllegalStateException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }
}
