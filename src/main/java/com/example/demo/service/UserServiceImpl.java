package com.example.demo.service;

import com.example.demo.Constants.Constants;
import com.example.demo.config.ApplicationProperties;
import com.example.demo.domain.Admin;
import com.example.demo.domain.Instructor;
import com.example.demo.domain.Student;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.EmailClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    EmailClient emailClient;

    @Autowired
    ApplicationProperties applicationProperties;

    @Override
    public String saveData(User user, String role) {
        if (role.equalsIgnoreCase(Constants.ROLE_ADMIN)) {
            user = new Admin(user.getName(), user.getEmail());
            //callEmailService(emailClient,user);

        } else if (role.equalsIgnoreCase(Constants.ROLE_INSTRUCTOR)) {
            user = new Instructor(user.getName(), user.getEmail());
            //callEmailService(emailClient,user);

        }else if(role.equalsIgnoreCase(Constants.ROLE_STUDENT)) {
            user=new Student(user.getName(),user.getEmail(),user.getUsername(),user.getPassword());
        }


        repository.save(user);
        return "Save successful";

    }

    @Override
    public void delete(String id) {

        User user = repository.findOneByIdAndIsDeletedIsFalse(id);
        user.setDeleted(true);
        repository.save(user);


    }

    @Override
    public String update(String id, String email) {

        User user = repository.findOneByIdAndIsDeletedIsFalse(id);
        user.setEmail(email);
        repository.save(user);
        return "updated";
    }

    @Override
    public List<User> getUsers() {

//        System.out.println(applicationProperties.getProperties().getMail().getSmtp().getStarttls().getEnable());
        List<User> userList = repository.findAllByIsDeletedIsFalse();
        return userList;

    }

    @Override
    public List<User> getOneUserByName(String name) {

        List<User> userList = repository.findAllByNameAndIsDeletedIsFalse(name);
        return userList;
    }

    private static void callEmailService(EmailClient emailClient,User user){
        try {
            emailClient.sendEmail(user);

        }catch (Exception e){
            System.out.println(e);
        }
    }


}
