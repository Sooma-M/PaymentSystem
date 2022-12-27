package com.PaymentApplication.UserFunctionallity.Search;

import com.PaymentApplication.Exceptions.Sign.UserException;
import com.PaymentApplication.User.CurrentUser;
import com.PaymentApplication.User.UserType;

import java.util.ArrayList;
import java.util.List;

public class SimpleSearch implements ISearch {
    @Override
    public ArrayList<String> search(String text) {
        if (!CurrentUser.check(UserType.USER))
            throw new UserException();

        //success
        List<String> name = ServiceList.getInstance().getServicesName();
        ArrayList<String> result = new ArrayList<>();
        for (String x : name)
            if (x.toLowerCase().indexOf(text.toLowerCase()) != -1)
                result.add(x);
        return result;
    }
}
