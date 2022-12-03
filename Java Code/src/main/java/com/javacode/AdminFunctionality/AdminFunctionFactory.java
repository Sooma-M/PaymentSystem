package com.javacode.AdminFunctionality;

import com.javacode.*;
import com.javacode.AdminFunctionality.Discounts.DiscountCommand;
import com.javacode.AdminFunctionality.Discounts.DiscountForm;
import com.javacode.AdminFunctionality.ManageRefunds.manageRefundsCommand;
import com.javacode.AdminFunctionality.ManageRefunds.manageRefundsForm;
import com.javacode.Model.TypesOfDiscounts;
import com.javacode.Model.refundsRequestsModel;

public class AdminFunctionFactory implements FunctionFactory {
    public Object createFunction(String type) {
        return null;
    }
    @Override
    public Command createCommand(String type, Object o) {
        if (type.equals("discount"))
            return new DiscountCommand();
        else if (type.equals("refund"))
            return new manageRefundsCommand();
        return null;
    }
    @Override
    public FormUI createForm(String type) {
        if (type.equals("discount"))
            return new DiscountForm(TypesOfDiscounts.getInstance().getDiscountNames());
        else if (type.equals("refund"))
            return new manageRefundsForm(refundsRequestsModel.getInstance().getRequestsList());
        return null;
    }
}
