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
    public double makeDiscount(double original, double amount) {
        if(trans-1 == CurrentUser.getUser().getTransactions().size())
            return super.makeDiscount(original,amount);
        else
            return amount;
    }

    public int getTrans() {
        return trans;
    }

    @Override
    public String toString() {
        String result = super.toString();
        return result + "for transaction #" +trans;
    }
}
