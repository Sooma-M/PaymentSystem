package com.javacode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.javacode.Payment.Wallet;

public class User implements Serializable {
    private String username, email, password;
    private List<Transactions> transactions;
    Wallet wallet;

    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        wallet = new Wallet();
        transactions = new ArrayList<>();
    }
    public void addTransaction (Transactions t){transactions.add(t);}

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
