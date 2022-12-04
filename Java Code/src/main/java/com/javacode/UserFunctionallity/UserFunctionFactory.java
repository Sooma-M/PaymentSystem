package com.javacode.UserFunctionallity;

import com.javacode.*;
import com.javacode.Model.CurrentUser;
import com.javacode.Model.ServiceList;
import com.javacode.Payment.PaymentController;
import com.javacode.UserFunctionallity.AddFunds.FundsForm;
import com.javacode.UserFunctionallity.AddFunds.addFundsControl;
import com.javacode.UserFunctionallity.RefundRequest.RequestFundForm;
import com.javacode.UserFunctionallity.RefundRequest.reqFundsControl;
import com.javacode.UserFunctionallity.Search.ISearch;
import com.javacode.UserFunctionallity.Search.SearchController;
import com.javacode.UserFunctionallity.Search.SearchForm;
import com.javacode.UserFunctionallity.Search.SimpleSearch;
import com.javacode.UserFunctionallity.SelectService.SelectServiceControl;
import com.javacode.UserFunctionallity.SelectService.SelectServiceForm;
import com.javacode.UserFunctionallity.checkDiscount.Check;
import com.javacode.UserFunctionallity.checkDiscount.CheckDiscountController;
import com.javacode.UserFunctionallity.checkDiscount.checkDicountForm;
import com.javacode.UserFunctionallity.checkDiscount.checkDicount;

public class UserFunctionFactory implements FunctionFactory {
    @Override
    public Object createFunction(String type) {
        if (type.equals("Search for Services"))
            return new SimpleSearch();
        else if (type.equals("Check Discount"))
            return new checkDicount();
        else if (type.equals("Add Funds to the Wallet"))
            return new PaymentController();
        return null;
    }
    @Override
    public Controller createController(String type, Object o) {
        if (type.equals("Search for Services"))
            return new SearchController((ISearch) o);
        else if (type.equals("Make Refund"))
            return new reqFundsControl();
        else if (type.equals("Check Discount"))
            return new CheckDiscountController((Check) o);
        else if (type.equals("Add Funds to the Wallet"))
            return new addFundsControl((Controller) o);
        else if (type.equals("Payment for service"))
            return new SelectServiceControl();
        return null;
    }
    @Override
    public FormUI createForm(String type) {
        if (type.equals("Search for Services"))
            return new SearchForm();
        else if (type.equals("Make Refund"))
            return new RequestFundForm(CurrentUser.getUser().getTransactions(), CurrentUser.getUser().getRequests());
        else if (type.equals("Check Discount"))
            return new checkDicountForm(ServiceList.getInstance().getServicesName());
        else if (type.equals("Add Funds to the Wallet"))
            return new FundsForm();
        else if (type.equals("Payment for service"))
            return new SelectServiceForm(ServiceList.getInstance().getServicesName());
        return null;
    }
}
