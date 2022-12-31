package com.PaymentApplication.ServiceProvider.Internet.WeServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class WeInternet extends ServiceProvider {
    private static WeInternet instance = new WeInternet();
    private WeInternet(){
        super("We Internet Payment Service", true);
        setHandler(new WeInternetHandler());
    }
    public static WeInternet getInstance(){
        return instance;
    }
}
