package com.javacode.Services;

import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.AdminFunctionality.AddProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Service {
    private String name;
    private Map providers = new HashMap();
    private List<Discount> discounts = new ArrayList<>();
    private boolean cacheAccept;

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setCacheAccept(boolean cacheAccept) {this.cacheAccept = cacheAccept;}
    public boolean getCacheAccept(){return cacheAccept;}

    public void addProvider(ServiceProvider p) {
        if (providers.containsKey(p.getProviderName()))
            throw new IllegalArgumentException("Failed! This provider exist before in the system.");
        providers.put(p.getProviderName(),p);
    }
    public void removeProvider(String name){
        if (providers.containsKey(name))
            providers.remove(name);
        else
            throw new IllegalArgumentException("No provider with this name!");
    }
    public Map getProviders(){return providers;}

    public void addDiscount(Discount discount){
        discounts.add(discount);
    }
    public List<Discount> getDiscounts(){return discounts;}
}
