package com.PaymentApplication.ServiceProvider.Donation;

import com.PaymentApplication.ServiceProvider.Donation.Hospital.CancerHospital;
import com.PaymentApplication.ServiceProvider.Donation.Hospital.CancerHospitalHandler;
import com.PaymentApplication.ServiceProvider.Donation.NGO.NGO;
import com.PaymentApplication.ServiceProvider.Donation.NGO.NGOHandler;
import com.PaymentApplication.ServiceProvider.Donation.Schools.School;
import com.PaymentApplication.ServiceProvider.Donation.Schools.SchoolHandler;
import com.PaymentApplication.ServiceProvider.Mobile.EtisalatServices.EtisalatMobile;
import com.PaymentApplication.ServiceProvider.Mobile.OrangeServices.OrangeMobile;
import com.PaymentApplication.ServiceProvider.Mobile.VodafoneServices.VodafoneMobile;
import com.PaymentApplication.ServiceProvider.Mobile.WeServices.WeMobile;
import com.PaymentApplication.ServiceProvider.ProviderHandler;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;

import java.util.HashMap;

public class DonationFactory implements ServiceProviderFactory {
    @Override
    public ServiceProvider createService(String type) {
        if (type.toLowerCase().contains("hospital")) {
            return CancerHospital.getInstance();
        } else if (type.toLowerCase().contains("ngo")) {
            return NGO.getInstance();
        } else if (type.toLowerCase().contains("school")) {
            return School.getInstance();
        }
        return null;
    }
}
