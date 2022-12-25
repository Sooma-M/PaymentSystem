package com.PaymentApplication.ServiceProvider.Mobile.WeServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class WeMobile extends ServiceProvider {
    private static WeMobile instance = new WeMobile();
    private WeMobile(){
        super("We Mobile Recharge Service", false);
    }
    public static WeMobile getInstance(){
        return instance;
    }
}
