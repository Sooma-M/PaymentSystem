package com.PaymentApplication.Sign;

import com.PaymentApplication.ServiceProvider.CurrentService;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.User;
import com.PaymentApplication.User.UserAccounts;

import java.util.List;
import java.util.Map;

public class SignIn implements Authentication {
    @Override
    public void executeSign(Map m) {
        User user = null;
        //check before sign in
        List<User> users = UserAccounts.getInstance().getUsers();
        for (User u : users) {
            if(u.getPassword().equals(m.get("password")) && u.getEmail().equals(m.get("email"))) {
                user = u;
                break;
            }
        }
        if (user == null)
            throw new IllegalArgumentException("Account not exist, please try again");

        CurrentService.setService(null);
        CurrentUser.setUser(user);
    }
}
