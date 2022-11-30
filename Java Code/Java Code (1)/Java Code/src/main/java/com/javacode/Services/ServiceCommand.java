package com.javacode.Services;

import com.javacode.Command;

import java.util.Map;

public class ServiceCommand implements Command {
    @Override
    public void execute(Map m) {
        System.out.println("Iam in ServiceCommand");
    }
}
