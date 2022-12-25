package com.PaymentApplication.User;

import com.PaymentApplication.UserFunctionallity.Payment.Wallet;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username, email, password;
    private List<Transaction> transactions;
    private List<TransactionRequest> requests;
    private Wallet wallet;
    private UserType type;

    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
        wallet = new Wallet();
        transactions = new ArrayList<>();
        requests = new ArrayList<>();
        type = UserType.USER;
    }

    public void setType(UserType type) {this.type = type;}
    public void addTransaction (Transaction t){transactions.add(t);}
    public void addRequest(TransactionRequest t){requests.add(t);}

    public List<TransactionRequest> getRequests() {return requests;}
    public String getUsername() {return username;}
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Wallet getWallet() {return wallet;}
    public List<Transaction> getTransactions(){return transactions;}
    public UserType getType() {return type;}

    public String toString() {return "User{" + "username='" + username + '\'' + ", email='" + email + '\'' + ", password='" + password + '\'' + '}';}
}
