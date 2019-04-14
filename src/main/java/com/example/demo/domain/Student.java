package com.example.demo.domain;

import com.example.demo.Constants.Constants;

public class Student extends User {

    public Student(String name, String email,String username,String password) {
        super.role = Constants.ROLE_STUDENT;
        this.setName(name);
        this.setEmail(email);
        this.setUsername(username);
        this.setPassword(password);
    }
}
