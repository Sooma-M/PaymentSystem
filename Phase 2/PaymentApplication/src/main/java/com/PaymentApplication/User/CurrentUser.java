package com.PaymentApplication.User;

public class CurrentUser {
    private static User user = null;
    public static void setUser(User u)
    {
        user = u;
    }
    public static User getUser() {
        return user;
    }

    public static void checkUser(){
        if (user == null)
            throw new IllegalAccessError("This function not allowed, you need to sign in first!");
    }
    public static void checkAdmin(){
        if (user == null)
            throw new IllegalAccessError("This function not allowed, you need to sign in first!");
        if (user.getType() != UserType.ADMIN)
            throw new IllegalAccessError("You need to be admin to be able to use this feature");
    }

}
