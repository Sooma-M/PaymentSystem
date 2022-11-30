package com.javacode.UserFunctionallity.checkDiscount;

import com.javacode.Command;
import com.javacode.FormUI;
import com.javacode.Services.SelectServiceCommand;

import java.util.List;
import java.util.Map;

public class CheckDiscountCommand implements Command {
      private  Check check;
      public   CheckDiscountCommand(Check obj){
        this.check=obj;
    }

    @Override
    public void execute(Map m) {
        List result = check.check(m);
        FormUI form = (FormUI) m.get("form");
        if (result.size() != 0)
            form.setCommand(new SelectServiceCommand());
        if(form instanceof DicountForm)
            ((DicountForm) form).DiscountResult(result);
    }
}
