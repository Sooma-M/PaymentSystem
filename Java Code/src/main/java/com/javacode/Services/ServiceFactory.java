package com.javacode.Services;

import com.javacode.Command;
import com.javacode.FormUI;

import java.util.Map;

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
    public FormUI createForm(String type, Map providers){
        if (type.equals("cli"))
            return new ServiceForm(providers);
        return null;
    }
    public Command createCommand(String type){
        if (type.equals("cli"))
            return new ServiceControl();
        return null;
    }
}
