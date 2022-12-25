package com.PaymentApplication.AdminFunctionality.ListUserTrans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ListTransForm {
    @GetMapping(value = "/admin/list-user-transactions/{username}")
    public HashMap showTrans(@PathVariable String username) {
        HashMap m = new HashMap<>();
        try {
            m.put("status", true);
            m.put("Transactions", new ListTransController().getAllTrans(username));
            return m;
        } catch (IllegalArgumentException ex) {
            m.put("status", false);
            m.put("reason", ex.getMessage());
            return m;
        }
    }
}
