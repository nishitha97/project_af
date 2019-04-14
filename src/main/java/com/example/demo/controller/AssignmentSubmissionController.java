package com.example.demo.controller;

import com.example.demo.service.CourseService;
import com.example.demo.uploadFileResponse.UploadFileResponse;
import com.example.demo.util.DownloadUtility;
import com.example.demo.util.UploadUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@Validated
@RequestMapping("/api/submissions")
public class AssignmentSubmissionController {

    @Autowired
    UploadUtility uploadUtility;

    @Autowired
    DownloadUtility downloadUtility;

    @Autowired
    CourseService courseService;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/upload")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        UploadFileResponse res= uploadUtility.uploadFile(file);
        courseService.saveUploadResponse(res);
        return res;
    }


    @GetMapping("/{fileName}/download")
    public ResponseEntity<Resource> downloadFile(@PathVariable("fileName") String fileName, HttpServletRequest request) throws Exception {
        return downloadUtility.downloadFile(fileName, request);
    }

}
