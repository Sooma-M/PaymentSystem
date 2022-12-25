package com.PaymentApplication.AdminFunctionality.Discounts;


import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class SpecificDiscountController extends DiscountController {
    @Override
    public void execute(HashMap m) {
        check();
        ServiceProvider service = ServiceFactory.createFactory((String) m.get("service-name"))
                .createService((String) m.get(m.get("service-name")));
        Discount discount = DiscountFactory.makeDiscount(m);
        service.addDiscount(discount);
    }
}