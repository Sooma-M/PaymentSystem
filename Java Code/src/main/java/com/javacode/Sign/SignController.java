package com.javacode.Sign;

import com.javacode.Controller;

import java.util.Map;

public class SignController implements Controller {
    private Authentication sign;
    public SignController(Authentication a)
    {
        sign = a;
    }
    @Override
    public void execute(Map m) {
        sign.executeSign(m);
    }
}
