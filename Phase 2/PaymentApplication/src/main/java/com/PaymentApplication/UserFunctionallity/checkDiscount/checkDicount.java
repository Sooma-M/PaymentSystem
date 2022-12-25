package com.PaymentApplication.UserFunctionallity.checkDiscount;

import com.PaymentApplication.AdminFunctionality.Discounts.Discount;
import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.ServiceProvider.ServiceList;
import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class checkDicount implements IChecker{
    @Override
    public List check() {
        List result = new ArrayList<>();
        for (String service_name : ServiceList.getInstance().getServicesName()) {
            ServiceProvider service= ServiceFactory.createFactory(service_name).createService(service_name);
            for (Discount discount : service.getDiscounts())
                result.add("Service Name: " + service_name + ", " + discount.toString());
        }
        return result;
    }
}
