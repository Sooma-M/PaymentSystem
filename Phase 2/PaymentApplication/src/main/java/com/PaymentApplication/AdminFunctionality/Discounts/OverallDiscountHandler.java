package com.PaymentApplication.AdminFunctionality.Discounts;

import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.UserFunctionallity.Search.ServiceList;
import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class OverallDiscountHandler implements DiscountHandler {
    @Override
    public void execute(HashMap m) {
        CurrentUser.checkAdmin();
        Discount discount = DiscountFactory.makeDiscount(m);
        for (String service : ServiceList.getInstance().getServicesName())
        {
            ServiceProvider srv = ServiceFactory.createFactory(service).createService(service);
            srv.addDiscount(discount);
        }
    }
}
