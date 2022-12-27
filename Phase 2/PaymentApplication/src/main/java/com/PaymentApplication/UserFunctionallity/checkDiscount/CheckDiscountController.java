package com.PaymentApplication.UserFunctionallity.checkDiscount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class checkDiscountController {
    @GetMapping(value = "/user/discount-list")
    public List getDiscounts() {
        return CheckDiscountFactory.createChecker("simple").check();
    }
}
