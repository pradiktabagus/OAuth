package com.dulu.oauth.model;

public class ResponseLogin {
    private String accessToken;
    private String tokenType;

    public ResponseLogin(String accessToken, String tokenType){
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getTokenType() {
        return tokenType;
    }
}
