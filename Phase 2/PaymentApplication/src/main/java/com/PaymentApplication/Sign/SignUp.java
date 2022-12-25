package com.PaymentApplication.Sign;

import com.PaymentApplication.User.User;
import com.PaymentApplication.User.UserAccounts;

import java.util.List;
import java.util.Map;

public class SignUp implements Authentication{
    @Override
    public void executeSign(Map m){
        List<User> users = UserAccounts.getInstance().getUsers();
        //check before add new user
        for (User user : users) {
            String username = user.getUsername();
            String email = user.getEmail();
            if(username.equals(m.get("username")) && email.equals(m.get("email")))
                throw new IllegalArgumentException("Username and email exist! try again");
            if(username.equals(m.get("username")))
                throw new IllegalArgumentException("Username exist! try again");
            if(email.equals(m.get("email")))
                throw new IllegalArgumentException("Email exist! try again");
        }
        UserAccounts.getInstance().addUser(new User((String) m.get("username"), (String) m.get("email"), (String) m.get("password")));
    }
}
