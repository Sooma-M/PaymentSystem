package com.PaymentApplication.Exceptions;

public class DiscountTypeException extends IllegalArgumentException{
    public DiscountTypeException(){
        super("Enter correct type and try again");
    }
}
