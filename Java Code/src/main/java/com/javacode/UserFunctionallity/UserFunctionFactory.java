package com.javacode.UserFunctionallity;

import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.FunctionFactory;
import com.javacode.UserFunctionallity.Search.ISearch;
import com.javacode.UserFunctionallity.Search.SearchCommand;
import com.javacode.UserFunctionallity.Search.SearchForm;
import com.javacode.UserFunctionallity.Search.SimpleSearch;
import com.javacode.UserFunctionallity.checkDiscount.Check;
import com.javacode.UserFunctionallity.checkDiscount.CheckDiscountCommand;
import com.javacode.UserFunctionallity.checkDiscount.DicountForm;
import com.javacode.UserFunctionallity.checkDiscount.checkDicount;

public class UserFunctionFactory implements FunctionFactory {
    @Override
    public Object createFunction(String type) {
        if (type.equals("search"))
            return new SimpleSearch();
        else if (type.equals("refund"))
            return new checkDicount();
        else if (type.equals("discount"))
            return null;
        else if (type.equals("wallet"))
            return null;
        return null;
    }
    @Override
    public Command createCommand(String type, Object o) {
        if (type.equals("search"))
            return new SearchCommand((ISearch) o);
        else if (type.equals("refund"))
            return null;
        else if (type.equals("discount"))
            return new CheckDiscountCommand((Check) o);
        else if (type.equals("wallet"))
            return null;
        return null;
    }
    @Override
    public FormUI createForm(String type) {
        if (type.equals("search"))
            return new SearchForm();
        else if (type.equals("refund"))
            return null;
        else if (type.equals("discount"))
            return new DicountForm();
        else if (type.equals("wallet"))
            return null;
        return null;
    }
}
