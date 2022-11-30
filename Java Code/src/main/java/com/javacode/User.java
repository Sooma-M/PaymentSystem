package com.javacode;

import java.io.Serializable;

import com.javacode.Model.Transactions;
import com.javacode.Payment.Wallet;

public class User implements Serializable {
    private String username, email, password;
    private Transactions transactions;
    Wallet wallet;
    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        this.transactions = new Transactions();
        wallet = new Wallet();
    }
    public String getUsername() {return username;}
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Transactions getTransactions(){
    	return transactions;
    }
    public Wallet getWallet() {return wallet;}

    public String toString() {return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';}
}
