package com.javacode.AdminFunctionality.Discounts;

import com.javacode.AdminFunctionality.Discounts.Overall.OverallDiscountCommand;
import com.javacode.AdminFunctionality.Discounts.Overall.OverallDiscountForm;
import com.javacode.AdminFunctionality.Discounts.Specific.SpecificDiscountCommand;
import com.javacode.AdminFunctionality.Discounts.Specific.SpecificDiscountForm;
import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Model.ServiceList;

public class MakeDiscountFactory {

    public FormUI createForm(String type) {
        if(type.equals("Overall discount")){
            return new OverallDiscountForm();
        }
        else if(type.equals("Specific discount")){
            return new SpecificDiscountForm(ServiceList.getInstance().getServicesName());
        }
        return null;
    }
    public Command createCommand(String type)
    {
        if(type.equals("Overall discount")){
            return new OverallDiscountCommand(ServiceList.getInstance().getServicesName());
        }
        else if(type.equals("Specific discount")){
            return new SpecificDiscountCommand();
        }
        return null;
    }
}
