package com.PaymentApplication.AdminFunctionality.Discounts;

import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.ServiceProvider.ServiceList;
import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;
import java.util.List;

public class OverallDiscountController extends DiscountController {
    List<String> services;
    public OverallDiscountController() {
        this.services = ServiceList.getInstance().getServicesName();
    }

    @Override
    public void execute(HashMap m) {
        check();
        Discount discount = DiscountFactory.makeDiscount(m);
        for (String service : services)
        {
            ServiceProvider srv = ServiceFactory.createFactory(service).createService(service);
            srv.addDiscount(discount);
        }
    }
}
