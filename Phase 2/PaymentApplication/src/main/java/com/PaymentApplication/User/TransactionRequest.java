package com.PaymentApplication.User;

public class TransactionRequest{
    private String username;
    private Transaction transaction;

    public TransactionRequest(String u, Transaction t){
        username = u;
        transaction = t;
    }

    public Transaction getTransaction() {
        return transaction;
    }
    public String getUsername() {return username;}
}
