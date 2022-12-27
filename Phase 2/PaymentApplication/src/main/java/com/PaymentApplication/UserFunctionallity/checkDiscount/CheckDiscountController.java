package com.PaymentApplication.UserFunctionallity.checkDiscount;

import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.User.CurrentUser;

import java.util.List;

public class CheckDiscountController {
    public List getDiscounts() {
        if (CurrentUser.getUser() == null)
            throw new UserException();
        List result = CheckDiscountFactory.checkWay().check();
        return result;
    }

}
