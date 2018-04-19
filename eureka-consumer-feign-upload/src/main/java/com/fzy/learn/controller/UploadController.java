package com.fzy.learn.controller;

import com.fzy.learn.feign_client_service.UploadCilent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 *
 * @author Fucai
 * @date 2018/4/19
 */
@RestController
public class UploadController {

    @Autowired
    UploadCilent uploadCilent;

    @PostMapping("/upload")
    public String upload(MultipartFile file) {
        return uploadCilent.handleFileUpload(file);
    }
}