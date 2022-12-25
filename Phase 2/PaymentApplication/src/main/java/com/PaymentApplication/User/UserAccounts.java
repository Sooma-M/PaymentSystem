package com.PaymentApplication.User;

import java.util.ArrayList;
import java.util.List;

public class UserAccounts{
    private static UserAccounts instance = new UserAccounts();
    private List<User> users;
    private UserAccounts(){
        users = new ArrayList<>();
        User admin = new User("admin","admin","123");
        admin.setType(UserType.ADMIN);
        addUser(admin);
        addUser(new User("user","user","123"));
        //update here to get info from database
    }

    public List<User> getUsers() {
        return users;
    }
    public void addUser(User user) {
        users.add(user);
        //update here to add to database
    }

    //Get the only object available
    public static UserAccounts getInstance(){
        return instance;
    }
}
