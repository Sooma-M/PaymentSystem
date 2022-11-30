package com.javacode.Admin.AdminFunctionality.Discounts;

import java.util.Map;

public class SpecificDiscount implements Discount{
    private String name;
    private double amount;
    public SpecificDiscount(double amount)
    {
        this.name = "specific";
        this.amount = amount;
    }
    @Override
    public void makeDiscount(Map m) {

    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}
