package com.PaymentApplication.AdminFunctionality.Discounts;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DiscountForm {

    @PostMapping(value = "/admin/make-discount")
    public ResponseEntity make_discount(@RequestBody HashMap m)
    {
        /*type, service-name/transaction-number, discount-percentage*/
        try {
            DiscountController controller = DiscountFactory.createController((String) m.get("type"));
            if (controller == null)
                return ResponseEntity.status(HttpStatus.OK).body("Enter correct type!");
            controller.execute(m);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch (IllegalAccessError ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
        }
        catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.OK).body(ex.getMessage());
        }
    }
}
