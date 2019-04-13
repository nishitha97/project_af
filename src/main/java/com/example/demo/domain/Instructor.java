package com.example.demo.domain;

import com.example.demo.Constants.Constants;

public class Instructor extends User {

   public Instructor(String name,String email){
       super.role=Constants.ROLE_INSTRUCTOR;
       this.setName(name);
       this.setEmail(email);


   }

}
