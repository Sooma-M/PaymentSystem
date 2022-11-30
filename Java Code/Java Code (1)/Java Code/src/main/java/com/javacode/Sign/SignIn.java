package com.javacode.Sign;
import com.javacode.*;
import com.javacode.Model.CurrentUser;
import com.javacode.Model.UserAccounts;

import java.util.List;
import java.util.Map;

public class SignIn implements Authentication {

    @Override
    public void executeSign(Map m) {
        User user = null;
        //check before sign in
        List<User> users = UserAccounts.getUsers();
        for (User u : users)
        {
            if(u.getPassword().equals(m.get("password")) && u.getEmail().equals(m.get("email"))) {
                user = u;
                break;
            }
        }
        if (user == null)
            throw new IllegalArgumentException("Account not exist, please try again");
        CurrentUser.setUser(user);
    }
}
