package com.javacode.Sign;

import com.javacode.Command;

import java.util.Map;

public class SignCommand implements Command{
    private Authentication sign;
    public SignCommand(Authentication a)
    {
        sign = a;
    }
    @Override
    public void execute(Map m) {
        sign.executeSign(m);
    }
}
