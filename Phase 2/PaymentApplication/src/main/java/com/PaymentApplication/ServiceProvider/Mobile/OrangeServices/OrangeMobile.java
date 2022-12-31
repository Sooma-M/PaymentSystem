package com.PaymentApplication.ServiceProvider.Mobile.OrangeServices;

import com.PaymentApplication.ServiceProvider.ServiceProvider;

import java.util.HashMap;

public class OrangeMobile extends ServiceProvider {
    private static OrangeMobile instance = new OrangeMobile();
    private OrangeMobile(){
        super("Orange Mobile Recharge Service", false);
        setHandler(new OrangeMobileHandler());
    }
    public static OrangeMobile getInstance(){
        return instance;
    }
}
