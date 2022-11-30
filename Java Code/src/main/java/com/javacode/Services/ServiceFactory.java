package com.javacode.Services;

public class ServiceFactory{
        public Service createService(String type)
        {
            if (type.equals("Mobile Recharge Services"))
                return MobileRechargeService.getInstance();
            else if(type.equals("Internet Payment Services"))
                return InternetPaymentService.getInstance();
            else if(type.equals("Landline Services"))
                return LandlineService.getInstance();
            else if (type.equals("Donation Services"))
                return DonationService.getInstance();
            return null;
        }
}
