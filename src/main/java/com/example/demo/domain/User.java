package com.example.demo.domain;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @Id
    private String id;

    @NotNull
    @Size(min=2,max=30, message="Name should have at least 2 characters")
    protected String name;

    @NotNull
    @Size(min=2, max= 20, message="Email should have at least 2 characters")
    protected String email;

    protected String role;

    @NotNull
    protected boolean isDeleted=false;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getRole(){
        return role;
    }





}
