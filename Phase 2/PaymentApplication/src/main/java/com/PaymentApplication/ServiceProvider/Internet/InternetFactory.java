package com.PaymentApplication.ServiceProvider.Internet;

import com.PaymentApplication.ServiceProvider.Internet.EtisalatServices.EtisalatInternet;
import com.PaymentApplication.ServiceProvider.Internet.EtisalatServices.EtisalatInternetHandler;
import com.PaymentApplication.ServiceProvider.Internet.OrangeServices.OrangeInternet;
import com.PaymentApplication.ServiceProvider.Internet.OrangeServices.OrangeInternetHandler;
import com.PaymentApplication.ServiceProvider.Internet.VodafoneServices.VodafoneInternet;
import com.PaymentApplication.ServiceProvider.Internet.VodafoneServices.VodafoneInternetHandler;
import com.PaymentApplication.ServiceProvider.Internet.WeServices.WeInternet;
import com.PaymentApplication.ServiceProvider.Internet.WeServices.WeInternetHandler;
import com.PaymentApplication.ServiceProvider.Mobile.EtisalatServices.EtisalatMobile;
import com.PaymentApplication.ServiceProvider.Mobile.OrangeServices.OrangeMobile;
import com.PaymentApplication.ServiceProvider.Mobile.VodafoneServices.VodafoneMobile;
import com.PaymentApplication.ServiceProvider.Mobile.WeServices.WeMobile;
import com.PaymentApplication.ServiceProvider.ProviderHandler;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;

import java.util.HashMap;

public class InternetFactory implements ServiceProviderFactory {
    @Override
    public ServiceProvider createService(String type) {
        if (type.toLowerCase().contains("etisalat")) {
            return EtisalatInternet.getInstance();
        } else if (type.toLowerCase().contains("vodafone")) {
            return VodafoneInternet.getInstance();
        } else if (type.toLowerCase().contains("orange")) {
            return OrangeInternet.getInstance();
        } else if (type.toLowerCase().contains("we")) {
            return WeInternet.getInstance();
        }
        return null;
    }
}
