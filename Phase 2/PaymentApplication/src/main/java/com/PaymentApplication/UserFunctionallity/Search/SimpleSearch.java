package com.PaymentApplication.UserFunctionallity.Search;

import com.PaymentApplication.User.CurrentUser;

import java.util.ArrayList;
import java.util.List;

public class SimpleSearch implements ISearch {
    @Override
    public ArrayList<String> search(String text) {
        if (!CurrentUser.checkUser())
            throw new IllegalArgumentException("This function not allowed, you need to sign in first!");

        //success
        List<String> name = ServiceList.getInstance().getServicesName();
        ArrayList<String> result = new ArrayList<>();
        for (String x : name)
            if (x.toLowerCase().indexOf(text.toLowerCase()) != -1)
                result.add(x);
        return result;
    }
}
