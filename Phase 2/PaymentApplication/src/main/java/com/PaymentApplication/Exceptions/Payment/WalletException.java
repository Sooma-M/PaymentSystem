package com.PaymentApplication.Exceptions.Payment;

public class WalletException extends PaymentException{
    public WalletException(){
        super("Failed! you didn't have enough money in your wallet!");
    }
}
