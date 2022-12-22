package com.javacode.UserFunctionallity.checkDiscount;

import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.Services.Service;
import com.javacode.Services.ServiceFactory;

import java.util.List;
import java.util.Map;

public class checkDicount implements Check{
    @Override
    public List<Discount> check(Map m) {
        Service service_name= new ServiceFactory().createService((String) m.get("service"));
        List result = service_name.getDiscounts();
        return result;
    }
}
