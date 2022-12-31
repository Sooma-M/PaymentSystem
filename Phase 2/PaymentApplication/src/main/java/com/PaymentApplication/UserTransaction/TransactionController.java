package com.PaymentApplication.UserTransaction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @GetMapping(value = "/admin/transactions/{username}")
    public ResponseEntity showTrans(@PathVariable String username) {
        try {
            ITransaction trans = TransactionFactory.createTrans("simple");
            return ResponseEntity.status(HttpStatus.OK).body("Transactions: \n" + trans.getAllTrans(username).toString());
        } catch (IllegalAccessError ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
        }catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.OK).body(ex.getMessage());
        }
    }

    @GetMapping(value = "/user/transactions")
    public ResponseEntity getTransactions() {
        try {
            ITransaction trans = TransactionFactory.createTrans("simple");
            return ResponseEntity.status(HttpStatus.OK).body("Transactions: \n" + trans.getTransactions().toString());
        }catch (IllegalAccessError ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
        }
    }
}
