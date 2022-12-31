package com.PaymentApplication.ServiceProvider.Mobile;

import com.PaymentApplication.ServiceProvider.Mobile.EtisalatServices.EtisalatMobile;
import com.PaymentApplication.ServiceProvider.Mobile.OrangeServices.OrangeMobile;
import com.PaymentApplication.ServiceProvider.Mobile.VodafoneServices.VodafoneMobile;
import com.PaymentApplication.ServiceProvider.Mobile.WeServices.WeMobile;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;

public class MobileFactory implements ServiceProviderFactory {
    @Override
    public ServiceProvider createService(String type) {
        if (type.toLowerCase().contains("etisalat")) {
            return EtisalatMobile.getInstance();
        } else if (type.toLowerCase().contains("vodafone")) {
            return VodafoneMobile.getInstance();
        } else if (type.toLowerCase().contains("orange")) {
            return OrangeMobile.getInstance();
        } else if (type.toLowerCase().contains("we")) {
            return WeMobile.getInstance();
        }
        return null;
    }
}
