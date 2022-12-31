package com.PaymentApplication.AdminFunctionality.ManageRefunds;

public class ManageRefundsFactory {
    public static IRefundHandler createHandler(String type){
        if (type.equals("simple"))
            return new manageRefunds();
        return null;
    }
}
