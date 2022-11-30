package com.javacode.Sign;

import com.javacode.Model.UserAccounts;
import com.javacode.User;

import java.util.List;
import java.util.Map;

public class SignUp implements Authentication{

    @Override
    public void executeSign(Map m) throws IllegalArgumentException{
        List<User> users = UserAccounts.getUsers();
        for (User user : users)
        {
            if(user.getUsername().equals(m.get("username")) && user.getEmail().equals(m.get("email")))
                throw new IllegalArgumentException("Username and email exist! try again");
            if(user.getUsername().equals(m.get("username")))
                throw new IllegalArgumentException("Username exist! try again");
            if(user.getEmail().equals(m.get("email")))
                throw new IllegalArgumentException("Email exist! try again");
        }
        UserAccounts.addUser(new User((String) m.get("username"), (String) m.get("email"), (String) m.get("password")));
    }
}
