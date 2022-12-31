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
        switch (type.toLowerCase()) {
            case "etisalat":
            case "etisalat mobile recharge service":
                return EtisalatMobile.getInstance();
            case "vodafone":
            case "vodafone mobile recharge service":
                return VodafoneMobile.getInstance();
            case "orange":
            case "orange mobile recharge service":
                return OrangeMobile.getInstance();
            case "we":
            case "we mobile recharge service":
                return WeMobile.getInstance();
        }
        return null;
    }
}
