package com.javacode.Payment;


public class Cache implements Payment {
    @Override
    public void pay(double amount){
        System.out.println("You will pay " + amount +" !");
    }
}
