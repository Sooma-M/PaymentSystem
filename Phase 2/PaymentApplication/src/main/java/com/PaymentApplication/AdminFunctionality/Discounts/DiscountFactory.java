package com.PaymentApplication.AdminFunctionality.Discounts;

import java.util.Map;

public class DiscountFactory {

    public static DiscountHandler createController(String type)
    {
        if(type.toLowerCase().equals("overall"))
            return new OverallDiscountHandler();
        else if(type.toLowerCase().equals("specific"))
            return new SpecificDiscountHandler();
        return null;
    }
    public static Discount makeDiscount(Map m)
    {
        String type = (String) m.get("type");
        if(type.toLowerCase().equals("specific"))
            return new SpecificDiscount(Double.parseDouble(m.get("discount-percentage").toString()));
        if(type.toLowerCase().equals("overall"))
            return new OverallDiscount(Double.parseDouble(m.get("discount-percentage").toString()),
                    Integer.parseInt(m.get("transaction-number").toString()));
        return null;
    }
}
