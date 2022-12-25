package com.PaymentApplication.UserFunctionallity.checkDiscount;

import com.PaymentApplication.User.CurrentUser;

import java.util.List;

public class CheckDiscountController {
    public List getDiscounts() {
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign-in first!");
        List result = CheckDiscountFactory.checkWay().check();
        return result;
    }

}
