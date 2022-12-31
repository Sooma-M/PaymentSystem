package com.PaymentApplication.UserFunctionallity.checkDiscount;

import com.PaymentApplication.AdminFunctionality.Discounts.Discount;
import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.UserFunctionallity.Search.ServiceList;
import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class checkDiscount implements IDiscountChecker {
    @Override
    public List check() {
        CurrentUser.checkUser();

        List result = new ArrayList<>();
        for (String service_name : ServiceList.getInstance().getServicesName()) { //get names
            ServiceProvider service = ServiceFactory.createFactory(service_name).createService(service_name); //get service
            for (Discount discount : service.getDiscounts())
                result.add("\n Service Name: " + service_name + ", " + discount.toString());
        }
        return result;
    }

    @Override
    public List check(String name) {
        CurrentUser.checkUser();

        List result = new ArrayList<>();
        ServiceProviderFactory ff = ServiceFactory.createFactory(name);
        if (ff == null)
            throw new IllegalArgumentException("Check the URL and try again");
        ServiceProvider service = ff.createService(name);
        if (service == null)
            throw new IllegalArgumentException("Check the URL and try again");

        for (Discount discount : service.getDiscounts())
            result.add("\n" + discount.toString());
        return result;
    }
}
