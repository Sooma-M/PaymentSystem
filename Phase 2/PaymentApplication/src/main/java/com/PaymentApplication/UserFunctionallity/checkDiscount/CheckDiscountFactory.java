package com.PaymentApplication.UserFunctionallity.checkDiscount;

public class CheckDiscountFactory {
    public static IDiscountChecker createChecker(String type) {
        if (type.equals("simple"))
            return new checkDiscount();
        return null;
    }
}
