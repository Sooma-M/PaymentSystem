package com.PaymentApplication.UserFunctionallity.Search;

public class SearchFactory {
    public static ISearch createSearch(String type) {
        if (type.equals("simple"))
            return new SimpleSearch();
        return null;
    }
}
