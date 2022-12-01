package com.javacode.AdminFunctionality.Discounts;

public abstract class Discount {
    private String name;
    private double amount;
    public double makeDiscount(double amount)
    {
        double discountPers = this.amount/100.0;
        double discount = amount * discountPers;
        return discount;

    }

    public void setName(String name) {this.name = name;}
    public void setAmount(double amount) {this.amount = amount;}
    public String getName() {return name;}
    public double getAmount() {return amount;}
}
