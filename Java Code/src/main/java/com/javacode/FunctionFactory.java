package com.javacode;

public interface FunctionFactory {
    Object createFunction(String type);
    Controller createController(String type, Object o);
    FormUI createForm(String type);
}
