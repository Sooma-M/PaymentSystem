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
        if (type.equals("Hospital") || type.toLowerCase().equals("Cancer Hospital Donation Service"))
            return CancerHospital.getInstance();
        else if (type.equals("NGO") || type.toLowerCase().equals("NGO (Non profitable organization) Donation Service"))
            return NGO.getInstance();
        else if (type.equals("School") || type.toLowerCase().equals("School Donation Service"))
            return School.getInstance();
        return null;
    }

    @Override
    public ProviderHandler createHandler(String type) {
        if (type.equals("Hospital") || type.toLowerCase().equals("Cancer Hospital Donation Service"))
            return new CancerHospitalHandler();
        else if (type.equals("NGO") || type.toLowerCase().equals("NGO (Non profitable organization) Donation Service"))
            return new NGOHandler();
        else if (type.equals("School") || type.toLowerCase().equals("School Donation Service"))
            return new SchoolHandler();
        return null;
    }
}
