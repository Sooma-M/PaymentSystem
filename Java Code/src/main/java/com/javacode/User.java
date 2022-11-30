package com.javacode;

import java.io.Serializable;
import java.util.List;

import com.javacode.Model.Transactions;

public class User implements Serializable {
    private String username, email, password;
    private List<Transactions> transactions;
    Wallet wallet;
    //Wallet wallet;
    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        wallet = new Wallet();
    }
    public String getUsername() {return username;}
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Wallet getWallet() {
    	return wallet;
    }
    public List<Transactions> getTransactions(){
    	return transactions;
    }
    public String toString() {return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';}
}
