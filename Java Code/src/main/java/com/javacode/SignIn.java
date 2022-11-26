package com.javacode;

import java.util.Map;

public class SignIn implements Authentication {
    @Override
    public void executeSign(Map m) {
        //check before sign in
        //database

        //if valid go to the functions
        UserFunctionFactory fc = new UserFunctionFactory();
        Command command = new ChooseFunctionCommand(fc);
        FormUI f = new ChooseFunctionForm();
        f.setCommand(command);
        f.getInfoFromUser();
    }
}
