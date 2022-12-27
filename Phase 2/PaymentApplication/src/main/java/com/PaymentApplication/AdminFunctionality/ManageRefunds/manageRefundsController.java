package com.PaymentApplication.AdminFunctionality.ManageRefunds;

import com.PaymentApplication.Exceptions.Sign.AdminException;
import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.UserType;

import java.util.HashMap;
import java.util.Map;

public class manageRefundsController{
    void check(){
        if (CurrentUser.getUser() == null)
            throw new UserException();
        if (CurrentUser.getUser().getType() != UserType.ADMIN)
            throw new AdminException();
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
