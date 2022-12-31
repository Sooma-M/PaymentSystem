package com.PaymentApplication.AdminFunctionality.ManageRefunds;

import com.PaymentApplication.User.TransactionRequest;

import java.util.HashMap;

public class refundsRequestsModel{
    private static refundsRequestsModel instance = new refundsRequestsModel();
    private static int cnt = 1;
	private HashMap<Integer, TransactionRequest> requestsList;

    private refundsRequestsModel() {
        requestsList = new HashMap<>();
        //get requests from database
    }

    public HashMap<Integer, TransactionRequest> getRequestsList() {return requestsList;}
    public TransactionRequest getRequest(int index){return requestsList.get(index);}

    //Get the only object available
    public static refundsRequestsModel getInstance(){
        return instance;
    }

    public void Subscribe(TransactionRequest o) {
        requestsList.put(cnt++,o);
        //add requests to database
    }

    public void Unsubscribe(int id) {
        if (!requestsList.containsKey(id))
            throw new IllegalArgumentException("No request with this id!");
        requestsList.remove(id);
        //remove requests from database
    }
}
