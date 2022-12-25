package com.PaymentApplication.ServiceProvider.Mobile;

import com.PaymentApplication.ServiceProvider.Mobile.EtisalatServices.EtisalatMobile;
import com.PaymentApplication.ServiceProvider.Mobile.EtisalatServices.EtisalatMobileHandler;
import com.PaymentApplication.ServiceProvider.Mobile.OrangeServices.OrangeMobile;
import com.PaymentApplication.ServiceProvider.Mobile.OrangeServices.OrangeMobileHandler;
import com.PaymentApplication.ServiceProvider.Mobile.VodafoneServices.VodafoneMobile;
import com.PaymentApplication.ServiceProvider.Mobile.VodafoneServices.VodafoneMobileHandler;
import com.PaymentApplication.ServiceProvider.Mobile.WeServices.WeMobile;
import com.PaymentApplication.ServiceProvider.Mobile.WeServices.WeMobileHandler;
import com.PaymentApplication.ServiceProvider.ProviderHandler;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;

import java.util.HashMap;

public class MobileFactory implements ServiceProviderFactory {
    @Override
    public ServiceProvider createService(String type) {
        if (type.toLowerCase().equals("etisalat") || type.toLowerCase().equals("Etisalat Mobile Recharge Service"))
            return EtisalatMobile.getInstance();
        else if (type.toLowerCase().equals("vodafone") || type.toLowerCase().equals("Vodafone Mobile Recharge Service"))
            return VodafoneMobile.getInstance();
        else if (type.toLowerCase().equals("orange") || type.toLowerCase().equals("Orange Mobile Recharge Service"))
            return OrangeMobile.getInstance();
        else if (type.toLowerCase().equals("we") || type.toLowerCase().equals("We Mobile Recharge Service"))
            return WeMobile.getInstance();
        return null;
    }

    @Override
    public ProviderHandler createHandler(String type) {
        if (type.toLowerCase().equals("etisalat") || type.toLowerCase().equals("Etisalat Mobile Recharge Service"))
            return new EtisalatMobileHandler();
        else if (type.toLowerCase().equals("vodafone") || type.toLowerCase().equals("Vodafone Mobile Recharge Service"))
            return new VodafoneMobileHandler();
        else if (type.toLowerCase().equals("orange") || type.toLowerCase().equals("Orange Mobile Recharge Service"))
            return new OrangeMobileHandler();
        else if (type.toLowerCase().equals("we") || type.toLowerCase().equals("We Mobile Recharge Service"))
            return new WeMobileHandler();
        return null;
    }
}
