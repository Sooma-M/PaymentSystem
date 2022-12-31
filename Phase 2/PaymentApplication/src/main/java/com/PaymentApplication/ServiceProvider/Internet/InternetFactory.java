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
        switch (type.toLowerCase()) {
            case "etisalat":
            case "etisalat internet payment service":
                return EtisalatInternet.getInstance();
            case "vodafone":
            case "vodafone internet payment service":
                return VodafoneInternet.getInstance();
            case "orange":
            case "orange internet payment service":
                return OrangeInternet.getInstance();
            case "we":
            case "we internet payment service":
                return WeInternet.getInstance();
        }
        return null;
    }
}
