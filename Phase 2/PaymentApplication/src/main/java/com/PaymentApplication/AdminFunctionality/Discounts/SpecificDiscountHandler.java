package com.PaymentApplication.AdminFunctionality.Discounts;


import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;
import com.PaymentApplication.User.CurrentUser;

import java.util.HashMap;

public class SpecificDiscountHandler implements DiscountHandler {
    @Override
    public void execute(HashMap m) {
        CurrentUser.checkAdmin();
        ServiceProviderFactory ff = ServiceFactory.createFactory((String) m.get("service-name"));
        if (ff == null)
            throw new IllegalArgumentException("enter correct service name!!!");
        ServiceProvider service = ff.createService((String) m.get("service-name"));
        if (service == null)
            throw new IllegalArgumentException("enter correct service name!!!");
        Discount discount = DiscountFactory.makeDiscount(m);
        service.addDiscount(discount);
    }
}