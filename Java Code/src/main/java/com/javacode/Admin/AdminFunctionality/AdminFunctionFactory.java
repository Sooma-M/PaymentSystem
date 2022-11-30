package com.javacode.Admin.AdminFunctionality;

import com.javacode.Admin.AdminFunctionality.Discounts.DiscountCommand;
import com.javacode.Admin.AdminFunctionality.Discounts.DiscountForm;
import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.FunctionFactory;

public class AdminFunctionFactory implements FunctionFactory {
    public Object createFunction(String type) {
        if (type.equals("Add_NewService_provider"))
            return null;
        else if (type.equals("Add_Discount"))
            return null;
        else if (type.equals("List_refund_Requests"))
            return null;
        return null;
    }
    @Override
    public Command createCommand(String type, Object o) {
        if (type.equals("Add_NewService_provider"))
            return null;
        else if (type.equals("Add_Discount"))
            return new DiscountCommand();
        else if (type.equals("List_refund_Requests"))
            return null;
        return null;
    }
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
