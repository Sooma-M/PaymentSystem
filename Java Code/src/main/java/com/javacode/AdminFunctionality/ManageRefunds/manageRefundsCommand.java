package com.javacode.AdminFunctionality.ManageRefunds;

import com.javacode.Command;
import com.javacode.TransactionRequest;
import com.javacode.Model.refundsRequestsModel;

import java.util.List;
import java.util.Map;

public class manageRefundsCommand implements Command {
    @Override
    public void execute(Map m) {
        List<Character> chooses = (List<Character>) m.get("answer");
        for (int i=0; i<chooses.size();i++) {
            if (chooses.get(i) == 'n')
                refundsRequestsModel.removeRequest(0);
            else {
                TransactionRequest t = refundsRequestsModel.getRequest(0);
                t.getUser().getWallet().addFunds(t.getTransaction().getAmount());
                refundsRequestsModel.removeRequest(0);
            }
        }
    }
}
