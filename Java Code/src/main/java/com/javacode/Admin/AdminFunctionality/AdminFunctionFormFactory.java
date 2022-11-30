package com.javacode.AdminFunctionality;


import com.javacode.AdminFunctionality.Discounts.DiscountForm;
import com.javacode.FormFactory;
import com.javacode.FormUI;

public class AdminFunctionFormFactory implements FormFactory {
    @Override
    public FormUI createForm(String type) {
        if (type.equals("Add_NewService_provider"))
            return null;
        else if (type.equals("Add_Discount"))
            return new DiscountForm();
        else if (type.equals("List_refund_Requests"))
            return null;
        return null;
    }
}
