package com.javacode.UserFunctionallity.Search;

import com.javacode.Model.ServiceList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SimpleSearch implements ISearch {
    @Override
    public List search(Map m) {
        List<String> name = ServiceList.getInstance().getServicesName();
        String text = (String) m.get("search");
        List<String> result = new ArrayList<>();
        for (String x : name)
            if (x.toLowerCase().indexOf(text.toLowerCase()) != -1)
                result.add(x);
        return result;
    }
}
