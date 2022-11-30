package com.javacode.UserFunctionallity;

import com.javacode.FormFactory;
import com.javacode.FormUI;
import com.javacode.UserFunctionallity.Search.SearchForm;

public class UserFunctionFormFactory implements FormFactory {
    @Override
    public FormUI createForm(String type) {
        if (type.equals("search"))
            return new SearchForm();
        else if (type.equals("refund"))
            return null;
        else if (type.equals("discount"))
            return null;
        else if (type.equals("wallet"))
            return null;
        return null;
    }
}
