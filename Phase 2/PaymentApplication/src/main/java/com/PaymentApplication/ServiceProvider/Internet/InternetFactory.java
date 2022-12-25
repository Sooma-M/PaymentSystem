package com.PaymentApplication.ServiceProvider.Internet;

import com.PaymentApplication.ServiceProvider.Internet.EtisalatServices.EtisalatInternet;
import com.PaymentApplication.ServiceProvider.Internet.EtisalatServices.EtisalatInternetHandler;
import com.PaymentApplication.ServiceProvider.Internet.OrangeServices.OrangeInternet;
import com.PaymentApplication.ServiceProvider.Internet.OrangeServices.OrangeInternetHandler;
import com.PaymentApplication.ServiceProvider.Internet.VodafoneServices.VodafoneInternet;
import com.PaymentApplication.ServiceProvider.Internet.VodafoneServices.VodafoneInternetHandler;
import com.PaymentApplication.ServiceProvider.Internet.WeServices.WeInternet;
import com.PaymentApplication.ServiceProvider.Internet.WeServices.WeInternetHandler;
import com.PaymentApplication.ServiceProvider.ProviderHandler;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;

import java.util.HashMap;

public class InternetFactory implements ServiceProviderFactory {
    @Override
    public ServiceProvider createService(String type) {
        if (type.toLowerCase().equals("etisalat") || type.toLowerCase().equals("Etisalat Internet Payment Service"))
            return EtisalatInternet.getInstance();
        else if (type.toLowerCase().equals("vodafone") || type.toLowerCase().equals("Vodafone Internet Payment Service"))
            return VodafoneInternet.getInstance();
        else if (type.toLowerCase().equals("orange") || type.toLowerCase().equals("Orange Internet Payment Service"))
            return OrangeInternet.getInstance();
        else if (type.toLowerCase().equals("we") || type.toLowerCase().equals("We Internet Payment Service"))
            return WeInternet.getInstance();
        return null;
    }

    @Override
    public ProviderHandler createHandler(String type) {
        if (type.toLowerCase().equals("etisalat") || type.toLowerCase().equals("Etisalat Internet Payment Service"))
            return new EtisalatInternetHandler();
        else if (type.toLowerCase().equals("vodafone") || type.toLowerCase().equals("Vodafone Internet Payment Service"))
            return new VodafoneInternetHandler();
        else if (type.toLowerCase().equals("orange") || type.toLowerCase().equals("Orange Internet Payment Service"))
            return new OrangeInternetHandler();
        else if (type.toLowerCase().equals("we") || type.toLowerCase().equals("We Internet Payment Service"))
            return new WeInternetHandler();
        return null;
    }
}
