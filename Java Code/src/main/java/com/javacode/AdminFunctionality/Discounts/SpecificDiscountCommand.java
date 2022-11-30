package com.javacode.AdminFunctionality.Discounts;
import com.javacode.Command;
import com.javacode.Services.Service;
import com.javacode.Services.ServiceFactory;

import java.util.Map;

public class SpecificDiscountCommand implements Command {
    @Override
    public void execute(Map m) {
        Service service = new ServiceFactory().createService((String) m.get("CrossedServices"));
        Discount discount = new DiscountFactory().makeDiscount(m);
        service.addDiscount(discount);
    }
}