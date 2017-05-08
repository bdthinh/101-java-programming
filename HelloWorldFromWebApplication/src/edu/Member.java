package edu;

/**
 * Created by thinhdbui on 7/5/17.
 */
public class Member {
    public String name;
    public String password;

    public Member(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean validate(){
        if (name.equals("admin") && password.equals("root")) {
            return true;
        }
        return false;
    }
}
