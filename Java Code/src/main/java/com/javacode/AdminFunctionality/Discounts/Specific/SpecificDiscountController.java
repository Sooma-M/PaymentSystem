package com.javacode.AdminFunctionality.Discounts.Specific;
import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.AdminFunctionality.Discounts.DiscountFactory;
import com.javacode.Controller;
import com.javacode.Services.Service;
import com.javacode.Services.ServiceFactory;

import java.util.Map;

public class SpecificDiscountController implements Controller {
    @Override
    public void execute(Map m) {
        Service service = new ServiceFactory().createService((String) m.get("CrossedServices"));
        Discount discount = new DiscountFactory().makeDiscount(m);
        service.addDiscount(discount);
    }
}