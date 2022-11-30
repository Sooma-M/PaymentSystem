package com.javacode.UserFunctionallity.Search;

import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Services.SelectServiceCommand;

import java.util.List;
import java.util.Map;

public class SearchCommand implements Command {
    ISearch search;
    public SearchCommand(ISearch s)
    {
        search = s;
    }
    @Override
    public void execute(Map m) {
        List result = search.search(m);

        FormUI form = (FormUI) m.get("form");
        if (result.size() != 0)
            form.setCommand(new SelectServiceCommand());

        if(form instanceof SearchForm)
            ((SearchForm) form).searchResult(result);
    }
}
