package com.PaymentApplication.UserFunctionallity.checkDiscount;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class checkDiscountController {
    @GetMapping(value = {"/user/get-discount-list", "/user/get-discount-list/{name}"})
    public ResponseEntity getDiscounts(@PathVariable(required = false) String name) {
        try{
            List discounts = null;
            if (name == null)
                discounts = CheckDiscountFactory.createChecker("simple").check();
            else
                discounts = CheckDiscountFactory.createChecker("simple").check(name);
            return ResponseEntity.status(HttpStatus.OK).body("Discounts: \n" + discounts);
        }catch (IllegalAccessError ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
        }catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        }
    }
}
