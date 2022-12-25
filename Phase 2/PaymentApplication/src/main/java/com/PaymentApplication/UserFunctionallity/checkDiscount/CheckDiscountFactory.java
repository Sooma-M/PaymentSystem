package com.PaymentApplication.UserFunctionallity.checkDiscount;

public class CheckDiscountFactory {
    public static CheckDiscountController createController() {
        return new CheckDiscountController();
    }
    public static IChecker checkWay() {
        return new checkDicount();
    }
}
