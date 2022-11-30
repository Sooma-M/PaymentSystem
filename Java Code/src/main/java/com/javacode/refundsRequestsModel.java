package com.javacode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class refundsRequestsModel {
	private static List<Map<String, Transactions>> requestsList = new ArrayList<>();
	public static List<Map<String, Transactions>> getRequestFunds() {
        return requestsList;
    }
    public static void addRequestFund(Map<String, Transactions> request) {
        requestsList.add(request);
    }
}
