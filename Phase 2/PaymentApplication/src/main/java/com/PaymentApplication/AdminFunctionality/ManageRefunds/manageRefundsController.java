package com.PaymentApplication.AdminFunctionality.ManageRefunds;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.UserType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class manageRefundsController{
    void check(){
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign-in first!");
        if (CurrentUser.getUser().getType() != UserType.ADMIN)
            throw new IllegalArgumentException("You need to be admin to be able to use this feature");
    }
    public HashMap getRequests(){
        check();
        return refundsRequestsModel.getInstance().getRequestsList();
    }
    public void execute(Map m){
        check();
        refundsRequestsModel.getInstance().Unsubscribe((Integer) m.get("id"));
    }
}
