package com.PaymentApplication.UserFunctionallity.Payment;


import com.PaymentApplication.Exceptions.Sign.SignException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class PaymentForm {

    @PostMapping(value = "/user/payment/{way}")
    public String getInfoFromUser(@PathVariable String way, @RequestBody HashMap m) {
        try {
            PaymentController paymentController = new PaymentController();
            paymentController.execute(way, m);
            return "Success";
        }
        catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }

    @PostMapping(value = "/user/payment")
    public String useCreditCard(@RequestBody HashMap m) {
        try {
            PaymentController paymentController = new PaymentController();
            paymentController.execute("credit-card", m);
            return "Success";
        }
        catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }
}
