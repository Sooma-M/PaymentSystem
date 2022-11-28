package com.javacode;

import java.io.*;
import java.util.Map;

public class SignUp implements Authentication{
    String usersFileName;
    public SignUp()
    {
        usersFileName = "txtFiles\\SystemUsers.txt";
    }
    public void setUsersFileName(String fileName)
    {
        usersFileName = fileName;
    }
    @Override
    public void executeSign(Map m) throws IllegalArgumentException{
        try {
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(usersFileName));
            //to read lines
            String Line;
            while ((Line = reader.readLine()) != null)
            {
                if(Line.equals(m.get("username")))
                    throw new IllegalArgumentException("Username is exist!");
                if ((Line = reader.readLine()) == null)
                    break;
                if(Line.equals(m.get("email")))
                    throw new IllegalArgumentException("Email is exist!");
                Line = reader.readLine();
            }
            reader.close();

            FileWriter writer = new FileWriter(usersFileName, true);
            writer.append(m.get("username")+"\n");
            writer.append(m.get("email")+"\n");
            writer.append(m.get("password")+"\n");
            writer.flush();
            writer.close();

            System.out.println("Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
