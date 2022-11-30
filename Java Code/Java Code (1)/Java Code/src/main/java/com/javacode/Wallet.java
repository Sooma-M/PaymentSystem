package com.javacode;

import java.util.Map;

public class Wallet implements Payment{
    private double amount;
    @Override
    public int pay(Map m){
        return 1;
    }
    public void addFunds(Map m){

    }
}
