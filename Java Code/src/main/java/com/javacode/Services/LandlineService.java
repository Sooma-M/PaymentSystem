package com.javacode.Services;

import com.javacode.Admin.providerObject;

import java.util.ArrayList;
import java.util.List;

public class LandlineService implements Service {
    private static ArrayList<providerObject> providers;
    private static List discounts;

    @Override
    public void addProvider(providerObject object) {
       providers.add(object);
    }

    @Override
    public void removeProvider() {

    }

    @Override
    public List getProviders() {
        return null;
    }

    @Override
    public void addDiscount() {

    }

    @Override
    public void removeDiscount() {

    }

    @Override
    public List getDiscount() {
        return null;
    }
}
