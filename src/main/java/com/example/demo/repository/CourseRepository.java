package com.example.demo.repository;

import com.example.demo.domain.CourseDTO;
import com.example.demo.uploadFileResponse.UploadFileResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<CourseDTO,Integer> {

    CourseDTO findOneById(String id);
}
