package com.example.demo;


import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class testUser {


    @Mock
    UserService userService;

    @Mock
    UserRepository userRepository;



  /* @Before
    public void beforeTesting(){
        //User user = new User();
       // user.setId("1234");
       // user.setEmail("something@gmail.com");
       // user.setName("nishitha");
       // user.setDeleted(false);
       // userRepository.save(user);



    }*/




    @Test
    public void TestSaveUsers(){




//        User user = new User();
//        user.setId("1234");
//        user.setEmail("something@gmail.com");
//        user.setName("nishitha");
//        user.setDeleted(false);
//
//
//
//        when(userRepository.save(user)).thenReturn(user);
//        when((userService.saveData(user))).thenReturn("Save successful");
//        assertEquals("Save successful",userService.saveData(user));

        //when(userService.saveData(user)).thenReturn("Save successful");
        //assertEquals("failure test","Save successful",userService.saveData(user));
        //verify(userService).saveData(user);

    }

    @Test
    public void TestDeleteUsers(){

//        User user = new User();
//        user.setId("1234");
//        user.setEmail("something@gmail.com");
//        user.setName("nishitha");
//        user.setDeleted(false);
//
//        when(userRepository.findOneByNameAndIsDeletedIsFalse("nishitha")).thenReturn(user);
//        when(userRepository.save(user)).thenReturn(user);
//        userService.delete("nishitha");
//        assertEquals("Failure-User should be deleted", true, user.isDeleted());
//        verify(userRepository).findOneByNameAndIsDeletedIsFalse("nishitha");

    }

    @Test
    public void TestUpdateUsers(){
//        User user = new User();
//        user.setId("1234");
//        user.setEmail("something@gmail.com");
//        user.setName("nishitha");
//        user.setDeleted(false);
//
//        when(userRepository.findOneById("1234")).thenReturn(user);
//        when(userRepository.save(user)).thenReturn(user);
//        when(userService.update(user.getId(),user.getEmail())).thenReturn("updated");
//        assertEquals("Failure-update", "updated", userService.update(user.getId(),user.getEmail()));
        //verify(userRepository).findOneById(user.getId());


    }

    @Test
    public void TestFindOneUser(){
        /*when(userService.getOneUser(user.getName())).thenReturn(user);
        assertEquals("failure test-findOneUser",user,userService.getOneUser(user.getName()));
        verify(userService).getOneUser(user.getName());*/

       /* User user = new User();
        user.setId("1234");
        user.setEmail("something@gmail.com");
        user.setName("nishitha");
        user.setDeleted(false);

        when(userRepository.findOneByName("nishitha")).thenReturn(user);
        assertEquals("Failure-find user", user, userServiceImpl.getOneUser("nishitha"));
        verify(userRepository).findOneByName(user.getName());*/

    }

   @Test
    public void TestFindUsers() throws Exception{
      /*  when(userService.getUsers()).thenReturn(userList);
        assertEquals("failure test-findUsers",userList,userService.getUsers());
        verify(userService).getUsers();*/

     /*  when(userRepository.findAll()).thenReturn(userList);
       assertEquals("Failure-findUsers",userList,userServiceImpl.getUsers());
       verify(userRepository).findAll();*/


    }




}
