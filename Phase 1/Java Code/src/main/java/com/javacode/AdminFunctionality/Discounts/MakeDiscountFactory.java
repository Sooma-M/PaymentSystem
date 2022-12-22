package com.javacode.AdminFunctionality.Discounts;

import com.javacode.AdminFunctionality.Discounts.Overall.OverallDiscountController;
import com.javacode.AdminFunctionality.Discounts.Overall.OverallDiscountForm;
import com.javacode.AdminFunctionality.Discounts.Specific.SpecificDiscountController;
import com.javacode.AdminFunctionality.Discounts.Specific.SpecificDiscountForm;
import com.javacode.Controller;
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
    public Controller createController(String type)
    {
        if(type.equals("Overall discount")){
            return new OverallDiscountController(ServiceList.getInstance().getServicesName());
        }
        else if(type.equals("Specific discount")){
            return new SpecificDiscountController();
        }
        return null;
    }
}
