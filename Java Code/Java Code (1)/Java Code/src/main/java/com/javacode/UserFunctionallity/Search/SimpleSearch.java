package com.javacode.UserFunctionallity.Search;

import com.javacode.Printer;

import java.util.ArrayList;
import java.util.HashMap;
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
    @Override
    public void search(Map m) {
        String text = (String) m.get("search");
        List<String> result = new ArrayList<>();

        //search
        for (String x : name)
            if (x.toLowerCase().indexOf(text.toLowerCase()) != -1)
                result.add(x);

        //print result!
        Map map = new HashMap<>();
        map.put("result", result);
        Printer p = new PrintSearchResult(map);
    }
}
