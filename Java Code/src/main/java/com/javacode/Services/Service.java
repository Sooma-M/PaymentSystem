package com.javacode.Services;

import com.javacode.Admin.AdminFunctionality.Discounts.Discount;
import com.javacode.Admin.providerObject;

import java.util.List;
import java.util.Map;

public abstract class Service {
    private static List providers;
    private static Map discounts;

    public void addProvider(providerObject p) {

    }
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
