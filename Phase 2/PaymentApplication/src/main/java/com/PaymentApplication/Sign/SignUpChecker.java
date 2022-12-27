package com.PaymentApplication.Sign;

import com.PaymentApplication.User.User;
import com.PaymentApplication.User.UserAccounts;

import java.util.HashMap;
import java.util.List;

public class SignUpChecker implements CheckUser {
    @Override
    public User check(HashMap m) {
        User u = null;
        List<User> users = UserAccounts.getInstance().getUsers();
        for (User user : users) {
            String username = user.getUsername();
            String email = user.getEmail();
            if(username.equals(m.get("username")) || email.equals(m.get("email"))) {
                u = user;
                break;
            }
        }
        return u;
    }
}
