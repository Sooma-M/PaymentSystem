package com.javacode.AdminFunctionality.ManageRefunds;

import com.javacode.Controller;
import com.javacode.TransactionRequest;
import com.javacode.Model.refundsRequestsModel;

import java.util.List;
import java.util.Map;

public class manageRefundsController implements Controller {
    @Override
    public void execute(Map m) {
        List<Character> chooses = (List<Character>) m.get("answer");
        for (int i=0; i<chooses.size();i++) {
            if (chooses.get(i) == 'y') {
                TransactionRequest t = (TransactionRequest) refundsRequestsModel.getInstance().getRequest(0);
                t.getUser().getWallet().addFunds(t.getTransaction().getAmount());
            }
        }
        refundsRequestsModel.getInstance().Notify(chooses);
    }
}
