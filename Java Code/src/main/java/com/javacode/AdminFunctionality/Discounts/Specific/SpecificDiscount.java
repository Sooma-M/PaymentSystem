package com.javacode.AdminFunctionality.Discounts.Specific;

import com.javacode.AdminFunctionality.Discounts.Discount;

public class SpecificDiscount extends Discount {
    public SpecificDiscount(double amount)
    {
        setName("specific");
        setAmount(amount);
    }
}
