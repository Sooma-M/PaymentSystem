package com.PaymentApplication.AdminFunctionality.Discounts;

import com.PaymentApplication.ServiceProvider.CurrentService;

import java.util.List;

public class ApplyDiscount {
    public static double makeDiscount(double amount){
        //make discounts
        List<Discount> discounts = CurrentService.getService().getDiscounts();
        double original = amount;
        for (Discount discount : discounts)
            amount = discount.makeDiscount(original, amount);
        return amount;
    }
}
