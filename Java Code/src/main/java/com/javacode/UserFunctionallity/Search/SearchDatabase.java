package com.javacode.UserFunctionallity.Search;

import com.javacode.ISearch;
import com.javacode.Printer;
import com.javacode.UserFunctionallity.Search.PrintSearchResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchDatabase implements ISearch {
    private List<String> name;
    public SearchDatabase()
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
        for (String x : name)
        {
            if (x.toLowerCase().indexOf(text.toLowerCase()) != -1)
            {
                result.add(x);
            }
        }
        Printer p = new PrintSearchResult();
        Map map = new HashMap<>();
        map.put("result", result);
        p.print(map);
    }
}
