package com.rakovpublic.shoestore.model;

/**
 * Created by rakovskyi on 18.02.15.
 */
public class User {

    private String tempCode;
    private static User user=null;
    private User()
    {

    }
    public static User getUser(String temCo){
        if(user==null){
            user =new User();
        }
        return user;
    }
    public String getTempCode() {
        return tempCode;
    }

    public void setTempCode(String tempCode) {
        this.tempCode = tempCode;
    }
}
