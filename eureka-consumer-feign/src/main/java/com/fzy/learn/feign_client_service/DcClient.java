package com.fzy.learn.feign_client_service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Fucai
 * @date 2018/4/18
 */

@FeignClient("eureka-client")
public interface DcClient {

  @GetMapping("/dc")
  String consumer();
}
