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

    public static boolean check(UserType type){
        return (user != null && user.getType().equals(type));
    }
}
