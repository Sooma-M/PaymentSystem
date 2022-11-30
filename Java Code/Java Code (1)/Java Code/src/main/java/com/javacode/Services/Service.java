package com.javacode.Services;

import com.javacode.AdminFunctionality.Discounts.Discount;

import java.util.List;
import java.util.Map;

public abstract class Service {
    private static List providers;
    private static Map discounts;

    void addProvider(){}
    void removeProvider(){}
    List getProviders(){return providers;}

    public void addDiscount(Discount discount){
        removeDiscount(discount.getName());
        discounts.put(discount.getName(), discount);
    }
    void removeDiscount(String name){
        if (discounts.containsKey(name))
            discounts.remove(name);
    }
    Map getDiscount(){return discounts;}
}
