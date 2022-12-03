package com.javacode.Services;

import com.javacode.AdminFunctionality.Discounts.Discount;
import com.javacode.Providers.ServiceProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Service {
    private String name;
    private Map<String,ServiceProvider> providers = new HashMap<>();
    private List<Discount> discounts = new ArrayList<>();
    private boolean cacheAccept;

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setCacheAccept(boolean cacheAccept) {this.cacheAccept = cacheAccept;}
    public boolean getCacheAccept(){return cacheAccept;}

    public void addProvider(String n,ServiceProvider p) {providers.put(n,p);}
    public Map<String,ServiceProvider> getProviders(){return providers;}

    public void addDiscount(Discount discount){
        discounts.add(discount);
    }
    public List<Discount> getDiscounts(){return discounts;}
}
