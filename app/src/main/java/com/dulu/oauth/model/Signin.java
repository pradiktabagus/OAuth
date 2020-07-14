package com.dulu.oauth.model;

public class Signin {
    private String usernameOrEmail;
    private String password;
    public Signin(String usernameOrEmail, String password){
        this.usernameOrEmail = usernameOrEmail;
        this.password = password;
    }
}
