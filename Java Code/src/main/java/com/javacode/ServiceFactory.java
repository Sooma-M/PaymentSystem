package com.javacode;

public class ServiceFactory{
        public Service createService(String type)
        {
            if (type.equals("Mobile Recharge Services"))
                return new MobileRechargeService();
            else if(type.equals("Internet Payment Services"))
                return new InternetPaymentService();
            else if(type.equals("Landline Services"))
                return new LandlineService();
            else if (type.equals("Donation Services"))
                return new DonationService();
            return null;
        }
}
