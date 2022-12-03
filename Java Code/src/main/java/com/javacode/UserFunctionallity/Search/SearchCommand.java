package com.javacode.UserFunctionallity.Search;

import com.javacode.Command;
import com.javacode.FormResult;
import com.javacode.FormUI;
import com.javacode.UserFunctionallity.UserFunctionFactory;

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
        List result = search.search((String)m.get("search"));

        FormUI form = (FormUI) m.get("form");
        if (result.size() != 0)
            form.setCommand(new UserFunctionFactory().createCommand((String) m.get("type"),null));

        FormResult formResult = (FormResult) m.get("form");
        formResult.result(result);
    }
}
