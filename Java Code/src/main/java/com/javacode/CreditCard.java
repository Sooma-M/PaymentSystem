package com.javacode;

import java.util.Map;

public class CreditCard implements Payment {
    @Override
    public int pay(Map m){
        return 1;
    }
}
