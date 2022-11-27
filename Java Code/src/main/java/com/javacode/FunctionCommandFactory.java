package com.javacode;

public class FunctionCommandFactory implements CommandFactory{
    @Override
    public Command createCommand(String type) {
        if (type.equals("search"))
            return new SearchCommand(new SearchDatabase());
        else if (type.equals("pay"))
            return null;
        else if (type.equals("refund"))
            return null;
        else if (type.equals("discount"))
            return null;
        else if (type.equals("wallet"))
            return null;
        return null;
    }
}
