package com.javacode.AdminFunctionality.Discounts;

import com.javacode.AdminFunctionality.Discounts.Overall.OverallDiscountCommand;
import com.javacode.AdminFunctionality.Discounts.Overall.OverallDiscountForm;
import com.javacode.AdminFunctionality.Discounts.Specific.SpecificDiscountCommand;
import com.javacode.AdminFunctionality.Discounts.Specific.SpecificDiscountForm;
import com.javacode.Command;
import com.javacode.FormUI;

public class MakeDiscountFactory {

    public FormUI createForm(String type) {
        if(type.equals("Overall_discount")){
            return new OverallDiscountForm();
        }
        else if(type.equals("Specific_discount")){
            return new SpecificDiscountForm();
        }
        return null;
    }
    public Command createCommand(String type)
    {
        if(type.equals("Overall_discount")){
            return new OverallDiscountCommand();
        }
        else if(type.equals("Specific_discount")){
            return new SpecificDiscountCommand();
        }
        return null;
    }
}
