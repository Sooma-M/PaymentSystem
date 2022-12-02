package com.javacode;

public class TransactionRequest {
    private User user;
    private Transaction transaction;

    public TransactionRequest(User u, Transaction t){user = u; transaction = t;}

    public Transaction getTransaction() {
        return transaction;
    }

    public User getUser() {
        return user;
    }
}
