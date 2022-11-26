package com.javacode;

public class UserFunctionFactory implements FormFactory{
    @Override
    public FormUI createForm(String type) {
        if (type.equals("search"))
            return null;
        else if (type.equals("pay"))
            return null;
        else if (type.equals("refund"))
            return null;
        else if (type.equals("discount"))
            return null;
        else if (type.equals("wallet"))
            return null;
        return null;
    }
}
