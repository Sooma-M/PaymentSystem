package com.javacode;

import java.io.Serializable;

import com.javacode.Model.Transactions;

public class User implements Serializable {
    private String username, email, password;
    private Transactions transactions;
    //Wallet wallet;
    public User(String username, String email, String password ,Transactions transactions)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        this.transactions = transactions;
        //wallet = new Wallet();
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
    public String toString() {return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';}
}
