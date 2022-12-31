package com.PaymentApplication.AdminFunctionality.ListUserTrans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListTransController {
    @GetMapping(value = "/admin/transactions/{username}")
    public String showTrans(@PathVariable String username) {
        try {
            ITrans trans = TransFactory.createTrans("simple");
            return "Transactions: \n" + trans.getAllTrans(username).toString();
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }
}
