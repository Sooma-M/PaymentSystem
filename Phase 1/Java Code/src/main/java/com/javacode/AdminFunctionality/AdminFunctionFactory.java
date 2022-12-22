package com.javacode.AdminFunctionality;

import com.javacode.*;
import com.javacode.AdminFunctionality.Discounts.DiscountController;
import com.javacode.AdminFunctionality.Discounts.DiscountForm;
import com.javacode.AdminFunctionality.ManageRefunds.manageRefundsController;
import com.javacode.AdminFunctionality.ManageRefunds.manageRefundsForm;
import com.javacode.Model.TypesOfDiscounts;
import com.javacode.Model.refundsRequestsModel;

public class AdminFunctionFactory implements FunctionFactory {
    public Object createFunction(String type) {
        return null;
    }
    @Override
    public Controller createController(String type, Object o) {
        if (type.equals("Make discount"))
            return new DiscountController();
        else if (type.equals("List refund"))
            return new manageRefundsController();
        return null;
    }
    @Override
    public FormUI createForm(String type) {
        if (type.equals("Make discount"))
            return new DiscountForm(TypesOfDiscounts.getInstance().getDiscountNames());
        else if (type.equals("List refund"))
            return new manageRefundsForm(refundsRequestsModel.getInstance().getRequestsList());
        return null;
    }
}
