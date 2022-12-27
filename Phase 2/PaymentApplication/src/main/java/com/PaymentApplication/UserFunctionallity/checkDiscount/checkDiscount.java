package com.PaymentApplication.UserFunctionallity.checkDiscount;

import com.PaymentApplication.AdminFunctionality.Discounts.Discount;
import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.ServiceProvider.ServiceFactory;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.UserFunctionallity.Search.ServiceList;
import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class checkDiscount implements IDiscountChecker {
    @Override
    public List check() {
        if (!CurrentUser.checkUser())
            throw new UserException();

        List result = new ArrayList<>();
        for (String service_name : ServiceList.getInstance().getServicesName()) { //get names
            ServiceProvider service = ServiceFactory.createFactory(service_name).createService(service_name); //get service
            for (Discount discount : service.getDiscounts())
                result.add("Service Name: " + service_name + ", " + discount.toString());
        }
        return result;
    }
}
