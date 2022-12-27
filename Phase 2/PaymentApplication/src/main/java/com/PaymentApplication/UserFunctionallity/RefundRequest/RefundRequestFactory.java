package com.PaymentApplication.UserFunctionallity.RefundRequest;

public class RefundRequestFactory {
    public static IRefund createRefund(String type) {
        if (type.equals("simple"))
            return new RequestFunds();
        return null;
    }
}
