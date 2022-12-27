package com.PaymentApplication.AdminFunctionality.Discounts;

import com.PaymentApplication.Exceptions.Sign.AdminException;
import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.UserType;

import java.util.HashMap;

public abstract class DiscountController {
    abstract void execute(HashMap m);

    void check(){
        if (CurrentUser.getUser() == null)
            throw new UserException();
        if (CurrentUser.getUser().getType() != UserType.ADMIN)
            throw new AdminException();
    }
}
