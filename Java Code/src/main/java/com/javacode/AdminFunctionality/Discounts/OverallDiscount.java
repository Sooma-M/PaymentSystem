package com.javacode.AdminFunctionality.Discounts;

import java.util.Map;

public class OverallDiscount implements Discount{
    String name;
    double amount;
    int trans;
    public OverallDiscount(double amount, int trans)
    {
        name = "overall";
        this.amount = amount;
        this.trans = trans;
    }
    @Override
    public void makeDiscount(Map m) {

    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public int getTrans() {
        return trans;
    }
}
