package com.PaymentApplication.ServiceProvider;

import com.PaymentApplication.AdminFunctionality.Discounts.Discount;

import java.util.ArrayList;
import java.util.List;

public abstract class ServiceProvider {
    private String name;
    private List<Discount> discounts = new ArrayList<>();
    private boolean cacheAccept;

    public ServiceProvider(String n, boolean cache){
        name = n;
        cacheAccept = cache;
    }
    public void setCacheAccept(boolean cacheAccept) {this.cacheAccept = cacheAccept;}

    public boolean getCacheAccept(){return cacheAccept;}
    public String getName() {return name;}

    public void addDiscount(Discount discount){discounts.add(discount);}
    public List<Discount> getDiscounts(){return discounts;}
}
