package com.PaymentApplication.AdminFunctionality.Discounts;

import java.util.Map;

public class DiscountFactory {

    public static DiscountController createController(String type)
    {
        if(type.toLowerCase().equals("overall"))
            return new OverallDiscountController();
        else if(type.toLowerCase().equals("specific"))
            return new SpecificDiscountController();
        return null;
    }
    public static Discount makeDiscount(Map m)
    {
        String type = (String) m.get("type");
        if(type.toLowerCase().equals("specific"))
            return new SpecificDiscount(Double.parseDouble((String) m.get("discount-percentage")));
        if(type.toLowerCase().equals("overall"))
            return new OverallDiscount(Double.parseDouble((String) m.get("discount-percentage")),
                    Integer.parseInt((String) m.get("transaction-number")));
        return null;
    }
}
