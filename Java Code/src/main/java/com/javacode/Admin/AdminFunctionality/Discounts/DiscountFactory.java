package com.javacode.AdminFunctionality.Discounts;

import java.util.Map;

public class DiscountFactory {
    public Discount makeDiscount(Map m)
    {
        if(m.get("type").equals("specific"))
            return new SpecificDiscount((double)m.get("DiscountPercent"));
        if(m.get("type").equals("overall"))
            return new OverallDiscount((double)m.get("DiscountPercent"), (int)m.get("transaction"));
        return null;
    }
}
