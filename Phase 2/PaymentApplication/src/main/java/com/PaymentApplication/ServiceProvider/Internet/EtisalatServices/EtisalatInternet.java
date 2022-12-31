package com.PaymentApplication.ServiceProvider.Internet.EtisalatServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class EtisalatInternet extends ServiceProvider {
    private static EtisalatInternet instance = new EtisalatInternet();
    private EtisalatInternet(){
        super("Etisalat Internet Payment Service", false);
        setHandler(new EtisalatInternetHandler());
    }
    public static EtisalatInternet getInstance(){
        return instance;
    }
}
