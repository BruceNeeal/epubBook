package com.bruce.bean;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private Integer userstatusid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUserstatusid() {
        return userstatusid;
    }

    public void setUserstatusid(Integer userstatusid) {
        this.userstatusid = userstatusid;
    }
}