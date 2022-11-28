package com.javacode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SignIn implements Authentication {
    String usersFileName;
    public SignIn()
    {
        usersFileName = "txtFiles\\SystemUsers.txt";
    }
    public void setUsersFileName(String fileName)
    {
        usersFileName = fileName;
    }
    @Override
    public void executeSign(Map m) {
        boolean found = false;
        //check before sign in
        try {
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(usersFileName));
            //to read lines
            String Line;
            while ((Line = reader.readLine()) != null)
            {
                int equal = 0;
                if ((Line = reader.readLine()) == null)
                    break;
                if(Line.equals(m.get("email")))
                    equal++;
                Line = reader.readLine();
                if(Line.equals(m.get("password")))
                    equal++;
                if (equal == 2)
                {
                    found = true;
                    break;
                }

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (found)
        {
            //if valid go to the functions
            UserFunctionFactory fc = new UserFunctionFactory();
            Command command = new ChooseFunctionCommand(fc);
            FormUI f = new ChooseFunctionForm();
            f.setCommand(command);
            f.getInfoFromUser();
        }
        else
            throw new IllegalArgumentException("Please check email and password then try again!");
    }
}
