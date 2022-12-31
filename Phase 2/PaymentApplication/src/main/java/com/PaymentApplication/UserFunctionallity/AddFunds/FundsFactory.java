package com.PaymentApplication.UserFunctionallity.AddFunds;

public class FundsFactory {
    public static IFunds createFunds(String type) {
        if (type.equals("simple"))
            return new SimpleAddFunds();
        return null;
    }
}
