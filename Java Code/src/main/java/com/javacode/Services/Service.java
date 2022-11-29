package com.javacode.Services;

import java.util.List;

public interface Service {
    void addProvider();
    void removeProvider();
    List getProviders();

    void addDiscount();
    void removeDiscount();
    List getDiscount();
}
