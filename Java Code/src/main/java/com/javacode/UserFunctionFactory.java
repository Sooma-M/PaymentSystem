package com.javacode;

public class UserFunctionFactory implements FormFactory{
    @Override
    public FormUI createForm(String type) {
        if (type == "search")
            return null;
        else if (type == "pay")
            return null;
        else if (type == "refund")
            return null;
        else if (type == "discount")
            return null;
        else if (type == "wallet")
            return null;
        return null;
    }
}
