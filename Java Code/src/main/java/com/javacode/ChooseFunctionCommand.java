package com.javacode;

import java.util.Map;

public class ChooseFunctionCommand implements Command{
    private FormFactory ff;
    public ChooseFunctionCommand(FormFactory f)
    {
        ff = f;
    }
    @Override
    public void execute(Map m) {
        FormUI form = ff.createForm((String) m.get("choose"));
        //form.getInfoFromUser();
    }
}
