package com.example.demo.controller;

import com.example.demo.domain.AssignmentDTO;
import com.example.demo.domain.CourseDTO;
import com.example.demo.domain.User;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Validated
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public String createCourse(@Valid @RequestBody CourseDTO course) throws Exception {

        courseService.createCourse(course);

        return "courseCreated";

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{courseId}/assignment")
    public String createCourse(@Valid @RequestBody AssignmentDTO assignmentDTO)throws Exception {


        courseService.createAssignment(assignmentDTO);

        return "assignmentCreated";

    }

}
