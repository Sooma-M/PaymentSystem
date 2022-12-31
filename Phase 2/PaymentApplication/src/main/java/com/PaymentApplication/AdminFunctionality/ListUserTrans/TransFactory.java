package com.PaymentApplication.AdminFunctionality.ListUserTrans;

public class TransFactory {
    public static ITrans createTrans(String type){
        if (type.equals("simple"))
            return new ListTrans();
        return null;
    }
}
