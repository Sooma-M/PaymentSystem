package com.PaymentApplication.UserTransaction;

public class TransactionFactory {
    public static ITransaction createTrans(String type){
        if (type.equals("simple"))
            return new TransactionGetter();
        return null;
    }
}
