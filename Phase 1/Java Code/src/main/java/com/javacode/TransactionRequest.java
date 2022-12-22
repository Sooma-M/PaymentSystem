package com.javacode;

public class TransactionRequest implements Observer{
    private User user;
    private Transaction transaction;
    private String state;

    public TransactionRequest(User u, Transaction t){user = u; transaction = t; state="No response yet";}

    public Transaction getTransaction() {
        return transaction;
    }

    public User getUser() {
        return user;
    }

    public String getState() {return state;}

    @Override
    public void update(String state) {this.state = state;}
}
