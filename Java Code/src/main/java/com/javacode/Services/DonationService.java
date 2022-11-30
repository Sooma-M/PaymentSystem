package com.javacode.Services;

public class DonationService extends Service {
    private static DonationService instance = new DonationService();
    private DonationService(){}
    //Get the only object available
    public static DonationService getInstance(){
        return instance;
    }
}
