package com.PaymentApplication.UserFunctionallity.Search;

import com.PaymentApplication.User.CurrentUser;

import java.util.ArrayList;

public class SimpleSearchController implements SearchController {
    ISearch search;
    public SimpleSearchController(ISearch s)
    {
        search = s;
    }
    public ArrayList execute(String message) {
        if (CurrentUser.getUser() == null)
            throw new IllegalArgumentException("You need to sign in first");
        ArrayList result = search.search(message);
        return result;
    }
}
