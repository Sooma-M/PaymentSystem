package com.PaymentApplication.Sign;

import com.PaymentApplication.User.User;
import com.PaymentApplication.User.UserAccounts;

import java.util.HashMap;
import java.util.List;

public class SignInChecker implements CheckUser {
    @Override
    public User check(HashMap m) {
        User user = null;
        List<User> users = UserAccounts.getInstance().getUsers();
        for (User u : users) {
            if(u.getPassword().equals(m.get("password")) && u.getEmail().equals(m.get("email"))) {
                user = u;
                break;
            }
        }
        return user;
    }
}
