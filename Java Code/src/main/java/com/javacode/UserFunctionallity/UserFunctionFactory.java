package com.javacode.UserFunctionallity;

import com.javacode.UserFunctionallity.Search.SearchDatabase;

public class UserFunctionFactory {
    public Object createFunction(String type) {
        if (type.equals("search"))
            return new SearchDatabase();
        else if (type.equals("refund"))
            return null;
        else if (type.equals("discount"))
            return null;
        else if (type.equals("wallet"))
            return null;
        return null;
    }
}
