package com.nus.tablecheckbackend.entity;

import lombok.Data;

@Data
public class User {
    private int uid;
    private String UUID;
    private String password;
    private String userName;

    public User(){}

    public User(String UUID, String password, String userName) {
        this.UUID = UUID;
        this.password = password;
        this.userName = userName;
    }
}
