package com.javacode.UserFunctionallity;

import com.javacode.Command;
import com.javacode.CommandFactory;
import com.javacode.UserFunctionallity.Search.ISearch;
import com.javacode.UserFunctionallity.Search.SearchCommand;

public class UserFunctionCommandFactory implements CommandFactory {
    @Override
    public Command createCommand(String type, Object o) {
        if (type.equals("search"))
            return new SearchCommand((ISearch) o);
        else if (type.equals("refund"))
            return null;
        else if (type.equals("discount"))
            return null;
        else if (type.equals("wallet"))
            return null;
        return null;
    }
}
