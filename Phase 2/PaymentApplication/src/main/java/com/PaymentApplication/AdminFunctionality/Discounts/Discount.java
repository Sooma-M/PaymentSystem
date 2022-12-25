package com.PaymentApplication.AdminFunctionality.Discounts;

public abstract class Discount {
    private String name;
    private double amount;
    public double makeDiscount(double original, double amount)
    {
        double discountPers = this.amount/100.0;
        double discount = original * discountPers;
        return amount - discount;

    }

    public void setName(String name) {this.name = name;}
    public void setAmount(double amount) {this.amount = amount;}
    public String getName() {return name;}
    public double getAmount() {return amount;}

    @Override
    public String toString() {
        return "Type= '" + name +"', Amount= " + amount;
    }
}
