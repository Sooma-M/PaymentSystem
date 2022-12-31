package com.PaymentApplication.UserFunctionallity.checkDiscount;

import java.util.List;

public interface IDiscountChecker {
    List check();
    List check(String name);
}
