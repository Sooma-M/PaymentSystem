package com.javacode.UserFunctionallity.checkDiscount;

import com.javacode.Controller;
import com.javacode.FormResult;
import com.javacode.FormUI;
import com.javacode.UserFunctionallity.UserFunctionFactory;

import java.util.List;
import java.util.Map;

public class CheckDiscountController implements Controller {
      private  Check check;
      public CheckDiscountController(Check obj){
        this.check=obj;
    }

    @Override
    public void execute(Map m) {
        List result = check.check(m);

        FormUI form = (FormUI) m.get("form");
        if (result.size() != 0)
            form.setController(new UserFunctionFactory().createController("Payment for service",null));

        FormResult formResult = (FormResult) m.get("form");
        formResult.result(result);
    }
}
