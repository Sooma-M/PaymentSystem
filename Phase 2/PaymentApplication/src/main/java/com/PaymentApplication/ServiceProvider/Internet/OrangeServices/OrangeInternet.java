package com.PaymentApplication.ServiceProvider.Internet.OrangeServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class OrangeInternet extends ServiceProvider {
    private static OrangeInternet instance = new OrangeInternet();
    private OrangeInternet(){
        super("Orange Internet Payment Service", false);
    }
    public static OrangeInternet getInstance(){
        return instance;
    }
}
