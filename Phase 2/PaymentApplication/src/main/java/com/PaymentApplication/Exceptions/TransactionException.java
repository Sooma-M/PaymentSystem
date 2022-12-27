package com.PaymentApplication.Exceptions;

public class TransactionException extends IllegalArgumentException{
    public TransactionException(){
        super("you didn't have any transaction with this specifications, try again");
    }
}
