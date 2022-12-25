package com.PaymentApplication.AdminFunctionality.Discounts;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DiscountForm {

    @PostMapping(value = "/admin/make-discount")
    public String getInfoFromUser(@RequestBody HashMap m)
    {
        /*type, service-name/transaction-number, discount-percentage*/
        try {
            DiscountController controller = DiscountFactory.createController((String) m.get("type"));
            if (controller == null)
                throw new IllegalArgumentException("Enter correct type and try again");
            controller.execute(m);
            return "Success";
        } catch (IllegalArgumentException ex) {
            return ex.getMessage();
        }
    }
}
