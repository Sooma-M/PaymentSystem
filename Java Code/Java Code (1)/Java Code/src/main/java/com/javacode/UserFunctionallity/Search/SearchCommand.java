package com.javacode.UserFunctionallity.Search;

import com.javacode.Command;

import java.util.Map;

public class SearchCommand implements Command {
    ISearch search;
    public SearchCommand(ISearch s)
    {
        search = s;
    }
    @Override
    public void execute(Map m) {
        search.search(m);
    }
}
