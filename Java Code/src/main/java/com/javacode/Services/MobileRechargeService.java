package com.javacode.Services;


public class MobileRechargeService extends Service {
    private static MobileRechargeService instance = new MobileRechargeService();
    private MobileRechargeService(){}
    //Get the only object available
    public static MobileRechargeService getInstance(){
        return instance;
    }
}
