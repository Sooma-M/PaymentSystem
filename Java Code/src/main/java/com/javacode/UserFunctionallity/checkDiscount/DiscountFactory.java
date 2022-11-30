package com.javacode.UserFunctionallity.checkDiscount;

import com.javacode.Services.DonationService;
import com.javacode.Services.InternetPaymentService;
import com.javacode.Services.LandlineService;
import com.javacode.Services.MobileRechargeService;

import java.util.Map;

public class DiscountFactory {
    public Object create_service(Map m){
        if(m.get("service name")=="1"){
            return  MobileRechargeService.getInstance();
        }
        else if(m.get("service name")=="2"){
            return InternetPaymentService.getInstance();
        }
        else if(m.get("service name")=="3"){
            return LandlineService.getInstance();
        }
        else if(m.get("service name")=="4"){
            return DonationService.getInstance();
        }
        else return null;
    }
}
