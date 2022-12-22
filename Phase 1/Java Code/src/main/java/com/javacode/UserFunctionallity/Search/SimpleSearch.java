package com.javacode.UserFunctionallity.Search;

import com.javacode.Model.ServiceList;

import java.util.ArrayList;
import java.util.List;

public class SimpleSearch implements ISearch {
    @Override
    public List search(String text) {
        List<String> name = ServiceList.getInstance().getServicesName();
        List<String> result = new ArrayList<>();
        for (String x : name)
            if (x.toLowerCase().indexOf(text.toLowerCase()) != -1)
                result.add(x);
        return result;
    }
}
