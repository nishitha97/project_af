package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api/users")
public class UserServiceController{

    @Autowired
    UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value="/{role}")
    public String addUser(@Valid @RequestBody User user,@PathVariable("role") String role){

        return userService.saveData(user,role);

    }

    @ResponseStatus(HttpStatus.NOT_MODIFIED)
    @DeleteMapping(value="/{id}")
    public void deleteUser(@PathVariable("id")  String id) {

         userService.delete(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(value="/{id}/{email}")
    public String updateUser(@PathVariable("id")  String id,@PathVariable String email) {

        return userService.update(id,email);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<User> findUsers() throws Exception {

        return userService.getUsers();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value="/{name}")
    public List<User> findOneUser( @PathVariable("name") String name){

        return userService.getOneUserByName(name);
    }




}
