package com.PaymentApplication.AdminFunctionality.ManageRefunds;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.UserType;

import java.util.HashMap;
import java.util.Map;

public class manageRefunds implements IRefundHandler {
    public HashMap getRequests(){
        CurrentUser.checkAdmin();
        return refundsRequestsModel.getInstance().getRequestsList();
    }
    public void execute(Map m){
        CurrentUser.checkAdmin();
        refundsRequestsModel.getInstance().Unsubscribe((Integer) m.get("id"));
    }
}
