package com.javacode.Services;

import com.javacode.Admin.providerObject;

import java.util.List;

public interface Service {
    void addProvider(providerObject object);
    void removeProvider();
    List getProviders();

    void addDiscount();
    void removeDiscount();
    List getDiscount();
}
