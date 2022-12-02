package com.javacode.UserFunctionallity;

import com.javacode.*;
import com.javacode.Payment.PaymentCommand;
import com.javacode.UserFunctionallity.AddFunds.FundsForm;
import com.javacode.UserFunctionallity.AddFunds.addFundsCommand;
import com.javacode.UserFunctionallity.RefundRequest.RequestFundForm;
import com.javacode.UserFunctionallity.RefundRequest.reqFundsCommand;
import com.javacode.UserFunctionallity.Search.ISearch;
import com.javacode.UserFunctionallity.Search.SearchCommand;
import com.javacode.UserFunctionallity.Search.SearchForm;
import com.javacode.UserFunctionallity.Search.SimpleSearch;
import com.javacode.UserFunctionallity.checkDiscount.Check;
import com.javacode.UserFunctionallity.checkDiscount.CheckDiscountCommand;
import com.javacode.UserFunctionallity.checkDiscount.checkDicountForm;
import com.javacode.UserFunctionallity.checkDiscount.checkDicount;

public class UserFunctionFactory implements FunctionFactory {
    @Override
    public Object createFunction(String type) {
        if (type.equals("search"))
            return new SimpleSearch();
        else if (type.equals("discount"))
            return new checkDicount();
        else if (type.equals("wallet"))
            return new PaymentCommand();
        return null;
    }
    @Override
    public Command createCommand(String type, Object o) {
        if (type.equals("search"))
            return new SearchCommand((ISearch) o);
        else if (type.equals("refund"))
            return new reqFundsCommand();
        else if (type.equals("discount"))
            return new CheckDiscountCommand((Check) o);
        else if (type.equals("wallet"))
            return new addFundsCommand((Command) o);
        return null;
    }
    @Override
    public FormUI createForm(String type) {
        if (type.equals("search"))
            return new SearchForm();
        else if (type.equals("refund"))
            return new RequestFundForm();
        else if (type.equals("discount"))
            return new checkDicountForm();
        else if (type.equals("wallet"))
            return new FundsForm();
        return null;
    }
}
