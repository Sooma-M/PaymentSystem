package com.PaymentApplication.ServiceProvider.Donation;

import com.PaymentApplication.ServiceProvider.Donation.Hospital.CancerHospital;
import com.PaymentApplication.ServiceProvider.Donation.Hospital.CancerHospitalHandler;
import com.PaymentApplication.ServiceProvider.Donation.NGO.NGO;
import com.PaymentApplication.ServiceProvider.Donation.NGO.NGOHandler;
import com.PaymentApplication.ServiceProvider.Donation.Schools.School;
import com.PaymentApplication.ServiceProvider.Donation.Schools.SchoolHandler;
import com.PaymentApplication.ServiceProvider.ProviderHandler;
import com.PaymentApplication.ServiceProvider.ServiceProvider;
import com.PaymentApplication.ServiceProvider.ServiceProviderFactory;

import java.util.HashMap;

public class DonationFactory implements ServiceProviderFactory {
    @Override
    public ServiceProvider createService(String type) {
        switch (type.toLowerCase()) {
            case "cancer-hospital":
            case "cancer hospital donation service":
                return CancerHospital.getInstance();
            case "ngo":
            case "ngo (non profitable organization) donation service":
                return NGO.getInstance();
            case "school":
            case "school donation service":
                return School.getInstance();
        }
        return null;
    }
}
