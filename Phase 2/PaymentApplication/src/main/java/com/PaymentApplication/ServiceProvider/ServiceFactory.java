package com.PaymentApplication.ServiceProvider;

import com.PaymentApplication.ServiceProvider.Donation.DonationFactory;
import com.PaymentApplication.ServiceProvider.Internet.InternetFactory;
import com.PaymentApplication.ServiceProvider.Landline.LandlineFactory;
import com.PaymentApplication.ServiceProvider.Mobile.MobileFactory;

public class ServiceFactory {
    public static ServiceProviderFactory createFactory(String type){
        if (type.toLowerCase().contains("mobile"))
            return new MobileFactory();
        else if (type.toLowerCase().contains("internet"))
            return new InternetFactory();
        else if (type.toLowerCase().contains("landline"))
            return new LandlineFactory();
        else if (type.toLowerCase().contains("donation"))
            return new DonationFactory();
        return null;
    }
    public static IServiceHandler createService(String type){
        if (type.toLowerCase().contains("simple"))
            return new ServiceHandler();
        return null;
    }
}
