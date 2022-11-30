package com.javacode.Services;


public class LandlineService extends Service {
    private static LandlineService instance = new LandlineService();
    private LandlineService(){}
    //Get the only object available
    public static LandlineService getInstance(){
        return instance;
    }
}
