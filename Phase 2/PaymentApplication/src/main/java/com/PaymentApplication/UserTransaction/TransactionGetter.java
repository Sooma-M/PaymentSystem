package com.PaymentApplication.UserTransaction;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.User;
import com.PaymentApplication.User.UserAccounts;

import java.util.ArrayList;
import java.util.HashMap;

public class TransactionGetter implements ITransaction {
    public HashMap getAllTrans(String username){
        CurrentUser.checkAdmin();
        HashMap list = new HashMap();
        boolean flag = false;
        for (User u : UserAccounts.getInstance().getUsers())
        {
            if (u.getUsername().equals(username))
            {
                flag = true;
                list.put("Payment Services", u.getTransactions());
                list.put("Refund Requests", u.getRequests());
            }
        }
        if (!flag)
            throw new IllegalArgumentException("username didn't exist, try again!");
        return list;
    }

    public ArrayList getTransactions() {
        CurrentUser.checkUser();
        ArrayList trans = (ArrayList) CurrentUser.getUser().getTransactions();
        return trans;
    }
}
