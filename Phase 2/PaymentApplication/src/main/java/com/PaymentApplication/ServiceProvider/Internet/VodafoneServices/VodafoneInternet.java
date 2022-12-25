package com.PaymentApplication.ServiceProvider.Internet.VodafoneServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class VodafoneInternet extends ServiceProvider {
    private static VodafoneInternet instance;
    private VodafoneInternet(HashMap m){
        super("Vodafone Internet Payment Service", false);
        instance = new VodafoneInternet(m);
    }
    public static VodafoneInternet getInstance(){
        return instance;
    }
}
