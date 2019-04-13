package com.example.demo.repository;

import com.example.demo.domain.AssignmentDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssignmentRepository extends MongoRepository<AssignmentDTO, Integer> {
}
