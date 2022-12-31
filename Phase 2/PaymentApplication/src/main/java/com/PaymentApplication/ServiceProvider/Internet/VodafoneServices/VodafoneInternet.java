package com.PaymentApplication.ServiceProvider.Internet.VodafoneServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class VodafoneInternet extends ServiceProvider {
    private static VodafoneInternet instance = new VodafoneInternet();
    private VodafoneInternet(){
        super("Vodafone Internet Payment Service", false);
        setHandler(new VodafoneInternetHandler());
    }
    public static VodafoneInternet getInstance(){
        return instance;
    }
}
