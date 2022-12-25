package com.PaymentApplication.UserFunctionallity.Search;

public class SearchFactory {
    public static ISearch createFunction(String type) {
        if (type.equals("simple"))
            return new SimpleSearch();
        return null;
    }
    public static SearchController createController(String type) {
        if (type.equals("simple"))
            return new SimpleSearchController(createFunction(type));
        return null;
    }
}
