package com.javacode.UserFunctionallity.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SimpleSearch implements ISearch {
    private List<String> name;
    public SimpleSearch()
    {
        name = new ArrayList<>();
        name.add("Mobile Recharge Services");
        name.add("Internet Payment Services");
        name.add("Landline Services");
        name.add("Donation Services");
    }
    public void addNewService(String n) {name.add(n);}
    @Override
    public List search(Map m) {
        String text = (String) m.get("search");
        List<String> result = new ArrayList<>();
        for (String x : name)
            if (x.toLowerCase().indexOf(text.toLowerCase()) != -1)
                result.add(x);
        return result;
    }
}
