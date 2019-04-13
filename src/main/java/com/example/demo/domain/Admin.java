package com.example.demo.domain;

import com.example.demo.Constants.Constants;

public class Admin extends User {

    public Admin(String name,String email){
        super.role=Constants.ROLE_ADMIN;
        this.setName(name);
        this.setEmail(email);

    }
}
