package com.PaymentApplication.AdminFunctionality.Discounts;


import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class SpecificDiscountController implements DiscountController {
    @Override
    public void execute(HashMap m) {
        CurrentUser.checkAdmin();
        ServiceProvider service = ServiceFactory.createFactory((String) m.get("service-name"))
                .createService((String) m.get("service-name"));
        Discount discount = DiscountFactory.makeDiscount(m);
        service.addDiscount(discount);
    }
}