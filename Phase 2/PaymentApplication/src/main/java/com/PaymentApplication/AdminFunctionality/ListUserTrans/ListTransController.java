package com.PaymentApplication.AdminFunctionality.ListUserTrans;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.User;
import com.PaymentApplication.User.UserAccounts;
import com.PaymentApplication.User.UserType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListTransController {
    void check(){
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign-in first!");
        if (CurrentUser.getUser().getType() != UserType.ADMIN)
            throw new IllegalArgumentException("You need to be admin to be able to use this feature");
    }
    public HashMap getAllTrans(String usename){
        check();
        HashMap list = new HashMap();
        boolean flag = false;
        for (User u : UserAccounts.getInstance().getUsers())
        {
            if (u.getUsername().equals(usename))
            {
                flag = true;
                list.put("Payment Services", u.getTransactions());
                list.put("Refund Requests",u.getRequests());
            }
        }
        if (!flag)
            throw new IllegalArgumentException("username didn't exist, try again!");
        return list;
    }
}
