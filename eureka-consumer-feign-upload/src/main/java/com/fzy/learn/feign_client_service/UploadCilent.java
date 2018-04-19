package com.fzy.learn.feign_client_service;

import com.fzy.learn.config.MultipartSupportConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Fucai
 * @date 2018/4/19
 */
@FeignClient(value = "eureka-client", configuration = MultipartSupportConfig.class)
public interface UploadCilent {

  @PostMapping(value = "/upload_file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  String handleFileUpload(@RequestPart(value = "file") MultipartFile file);

}
