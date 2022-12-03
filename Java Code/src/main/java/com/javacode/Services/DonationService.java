package com.javacode.Services;

import com.javacode.Providers.Donation.*;
import com.javacode.Providers.ProviderHandler;

public class DonationService extends Service {
    private static DonationService instance = new DonationService();
    private DonationService(){
        ProviderHandler handler = new DonationGeneralHandler();
        addProvider("Cancer Hospital", new CancerHospital(new DonationGeneralForm(handler), handler));
        addProvider("School", new School(new DonationGeneralForm(handler), handler));
        addProvider("NGO (Non profitable organization)", new NGO(new DonationGeneralForm(handler), handler));
        setCacheAccept(true);
        setName("Donation Services");
    }
    //Get the only object available
    public static DonationService getInstance(){
        return instance;
    }
}
