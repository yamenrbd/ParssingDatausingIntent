package com.gmail.yamen.parssingdatausingintent;

/**
 * Created by yamen on 2/21/2017.
 */

public class UserInfo{
    private String name ;
    private String password;

    public UserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}