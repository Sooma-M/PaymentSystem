package com.PaymentApplication.UserFunctionallity.checkDiscount;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class checkDicountForm{
    @GetMapping(value = "/user/discount-list")
    public List getInfoFromUser() {
        List discount = CheckDiscountFactory.createController().getDiscounts();
        return discount;
    }
}
