package com.javacode.Model;

import com.javacode.Observer;
import com.javacode.Subject;
import com.javacode.TransactionRequest;

import java.util.ArrayList;
import java.util.List;

public class refundsRequestsModel implements Subject {
    private static refundsRequestsModel instance = new refundsRequestsModel();
	private List<Observer> requestsList;

    private refundsRequestsModel() {
        requestsList = new ArrayList<>();
        //get requests from database
    }

    public List getRequestsList() {return requestsList;}
    public Observer getRequest(int index){return requestsList.get(index);}

    //Get the only object available
    public static refundsRequestsModel getInstance(){
        return instance;
    }

    @Override
    public void Subscribe(Observer o) {
        requestsList.add(o);
        //add requests to database
    }

    @Override
    public void Unsubscribe(Observer o) {
        requestsList.remove(o);
        //remove requests from database
    }

    @Override
    public void Notify(List response) {
        for (Object res : response){
            if ((Character)res == 'y') {
                requestsList.get(0).update("Accepted");
            }
            else
                requestsList.get(0).update("Refused");
            Unsubscribe(requestsList.get(0));
        }
    }
}
