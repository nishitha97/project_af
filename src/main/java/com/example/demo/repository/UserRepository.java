package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends MongoRepository<User, Integer> {


    User findOneByName(String name);

    User findOneById(String id);

    User findOneByNameAndIsDeletedIsFalse(String name);

    List<User> findAllByNameAndIsDeletedIsFalse(String name);

    List<User> findAllByIsDeletedIsFalse();


    User findOneByIdAndIsDeletedIsFalse(String id);
}
