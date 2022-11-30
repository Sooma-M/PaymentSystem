package com.javacode.AdminFunctionality;
public class AdminFunctionFactory {
    public Object createFunction(String type) {
        if (type.equals("Add_NewService_provider"))
            return null;
        else if (type.equals("Add_Discount"))
            return null;
        else if (type.equals("List_refund_Requests"))
            return null;
        return null;
    }
}
