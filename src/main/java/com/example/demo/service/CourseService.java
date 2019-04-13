package com.example.demo.service;

import com.example.demo.domain.AssignmentDTO;
import com.example.demo.domain.CourseDTO;

import javax.validation.Valid;

public interface CourseService {

    public void createCourse(@Valid  CourseDTO courseDTO) throws Exception;


    public void createAssignment(@Valid AssignmentDTO assignmentDTO) throws Exception;
}
