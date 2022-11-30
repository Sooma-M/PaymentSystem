package com.javacode.Services;

import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;

import java.util.HashMap;
import java.util.Map;

public abstract class Service {
    private Map providers = new HashMap();
    private Map discounts = new HashMap();

    public void addProvider(ServiceProvider p) {
        if (providers.containsKey(p.getProviderName()))
            throw new IllegalArgumentException("Failed! This provider exist before in the system.");
        providers.put(p.getProviderName(),p);
    }
    void removeProvider(String name){
        if (providers.containsKey(name))
            providers.remove(name);
        else
            throw new IllegalArgumentException("");
    }
    Map getProviders(){return providers;}

    public void addDiscount(Discount discount){
        removeDiscount(discount.getName());
        discounts.put(discount.getName(), discount);
    }
    void removeDiscount(String name){
        if (discounts.containsKey(name))
            discounts.remove(name);
        else
            throw new IllegalArgumentException("");
    }
    Map getDiscount(){return discounts;}
}
