package com.javacode;

import java.util.Map;

public class CreditCard implements Payment {
	private Command command;
    @Override
    public int pay(Map m){
    	try {
			command.execute(m);
			return 1;
		} catch (Exception e) {
			return 0;
		}
    }
}
