package com.PaymentApplication.AdminFunctionality.Discounts;

import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.UserType;

import java.util.HashMap;

public abstract class DiscountController {
    abstract void execute(HashMap m);

    void check(){
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign-in first!");
        if (CurrentUser.getUser().getType() != UserType.ADMIN)
            throw new IllegalArgumentException("You need to be admin to be able to use this feature");
    }
}
