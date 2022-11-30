package com.javacode;

public interface FunctionFactory {
    Object createFunction(String type);
    Command createCommand(String type, Object o);
    FormUI createForm(String type);
}
