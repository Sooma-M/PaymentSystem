package com.javacode.AdminFunctionality.Discounts;

import com.javacode.Model.CurrentService;

import java.util.List;

public class ApplyDiscount {
    public static double makeDiscount(double amount){
        //make discounts
        List<Discount> dicounts = CurrentService.getService().getDiscounts();
        double original = amount;
        for (Discount discount : dicounts)
            amount = discount.makeDiscount(original, amount);
        return amount;
    }
}
