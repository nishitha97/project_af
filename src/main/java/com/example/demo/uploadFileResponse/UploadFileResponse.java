package com.example.demo.uploadFileResponse;

import java.util.Date;

public class UploadFileResponse {
    private String submittedUserID;
    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private String uploadedDate;
    private long size;

    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size, String submittedUserID, String uploadedDate) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
        this.submittedUserID = submittedUserID;
        this.uploadedDate=uploadedDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getSubmittedUserID() {
        return submittedUserID;
    }

    public void setSubmittedUserID(String submittedUserID) {
        this.submittedUserID = submittedUserID;
    }

    public String getUploadedDate() {
        return uploadedDate;
    }

}
