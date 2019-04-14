package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {

    String saveData(User user, String role);

    void delete(String id);

    String update(String id, String email);

    List<User> getUsers() throws Exception;

    List<User> getOneUserByName(String name);


}
