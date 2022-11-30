package com.javacode.AdminFunctionality.Discounts.Overall;

import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.Model.CurrentUser;

public class OverallDiscount extends Discount {
    private int trans;
    public OverallDiscount(double amount, int trans)
    {
        setName("overall");
        setAmount(amount);
        this.trans = trans;
    }

    @Override
    public double makeDiscount(double amount) {
        if(trans == CurrentUser.getUser().getTransactions().size())
            return super.makeDiscount(amount);
        else
            return amount;
    }

    public int getTrans() {
        return trans;
    }
}
