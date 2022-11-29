package com.javacode;

import java.io.Serializable;

public class User implements Serializable {
    private String username, email, password;
    //Wallet wallet;
    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        //wallet = new Wallet();
    }
    public String getUsername() {return username;}
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String toString() {return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';}
}
