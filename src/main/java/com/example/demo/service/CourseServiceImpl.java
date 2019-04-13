package com.example.demo.service;

import com.example.demo.domain.AssignmentDTO;
import com.example.demo.domain.CourseDTO;
import com.example.demo.domain.User;
import com.example.demo.repository.AssignmentRepository;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    AssignmentRepository assignmentRepository;

    @Override
    public void createCourse(CourseDTO courseDTO) throws Exception {

        User user =userRepository.findOneById(courseDTO.getInstructorId());

        if(user!=null)
            courseRepository.save(courseDTO);
        else{
            throw new Exception("user not  found for given id");
        }

    }

    @Override
    public void createAssignment(@Valid AssignmentDTO assignmentDTO) throws Exception {

        CourseDTO courseDTO=courseRepository.findOneById(assignmentDTO.getCourseID());

        if(courseDTO!=null)
            assignmentRepository.save(assignmentDTO);
        else{
            throw new Exception("user not  found for given id");
        }


    }


}
