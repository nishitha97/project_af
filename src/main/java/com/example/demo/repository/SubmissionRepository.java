package com.example.demo.repository;

import com.example.demo.domain.uploadFileResponse.UploadFileResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepository extends MongoRepository<UploadFileResponse,Integer> {
}
