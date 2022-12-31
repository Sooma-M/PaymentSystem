package com.PaymentApplication.AdminFunctionality.Discounts;

import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.UserFunctionallity.Search.ServiceList;
import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;
import java.util.List;

public class OverallDiscountController implements DiscountController {
    List<String> services;
    public OverallDiscountController() {
        this.services = ServiceList.getInstance().getServicesName();
    }

    @Override
    public void execute(HashMap m) {
        CurrentUser.checkAdmin();
        Discount discount = DiscountFactory.makeDiscount(m);
        for (String service : services)
        {
            ServiceProvider srv = ServiceFactory.createFactory(service).createService(service);
            srv.addDiscount(discount);
        }
    }
}
