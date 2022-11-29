package com.javacode.Model;

import java.util.HashMap;
import java.util.Map;

public class Transactions {
	private Map<String, Double> transactionList = new HashMap<String, Double>();
	public void addTrans(String type ,double amount) {
		transactionList.put(type, amount);
	}
	public Map<String, Double> getTransactionList(){
		return transactionList;
	}
}
