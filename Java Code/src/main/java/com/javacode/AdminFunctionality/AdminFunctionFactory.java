package com.javacode.AdminFunctionality;

import com.javacode.AdminFunctionality.Discounts.DiscountCommand;
import com.javacode.AdminFunctionality.Discounts.DiscountForm;
import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.FunctionFactory;

public class AdminFunctionFactory implements FunctionFactory {
    public Object createFunction(String type) {
        if (type.equals("provider"))
            return null;
        else if (type.equals("discount"))
            return null;
        else if (type.equals("refund"))
            return null;
        return null;
    }
    @Override
    public Command createCommand(String type, Object o) {
        if (type.equals("provider"))
            return null;
        else if (type.equals("discount"))
            return new DiscountCommand();
        else if (type.equals("refund"))
            return null;
        return null;
    }
    @Override
    public FormUI createForm(String type) {
        if (type.equals("provider"))
            return null;
        else if (type.equals("discount"))
            return new DiscountForm();
        else if (type.equals("refund"))
            return null;
        return null;
    }
}
