package com.PaymentApplication.ServiceProvider;

import com.PaymentApplication.AdminFunctionality.Discounts.Discount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class ServiceProvider {
    private String name;
    private List<Discount> discounts;
    private HashMap parameters;
    private boolean cacheAccept;
    private ProviderHandler handler;

    public ServiceProvider(String n, boolean cache){
        name = n;
        cacheAccept = cache;
        discounts = new ArrayList<>();
        parameters = new HashMap<>();
    }

    public void setCacheAccept(boolean cacheAccept) {this.cacheAccept = cacheAccept;}
    public void setParameters(HashMap parameters) {this.parameters = parameters;}
    public void setHandler(ProviderHandler handler) {this.handler = handler;}

    public boolean getCacheAccept(){return cacheAccept;}
    public String getName() {return name;}
    public HashMap getParameters() {return parameters;}
    public ProviderHandler getHandler() {return handler;}
    public List<Discount> getDiscounts(){return discounts;}

    public void addDiscount(Discount discount){discounts.add(discount);}
}
