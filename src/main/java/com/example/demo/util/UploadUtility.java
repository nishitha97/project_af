package com.example.demo.util;


import com.example.demo.config.service.FileStorageService;
import com.example.demo.domain.uploadFileResponse.UploadFileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Date;

@Component
public class UploadUtility {

    @Autowired
    private FileStorageService fileStorageService;

    public UploadFileResponse uploadFile(MultipartFile file) throws Exception {

        String filename = fileStorageService.storeFile(file);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/submissions/")
                .path(filename)
                .path("/download")
                .toUriString();

        System.out.println("uploaded");
        return new UploadFileResponse(filename, fileDownloadUri,
                file.getContentType(), file.getSize(),"useridhere",new Date().toString());



    }
}
