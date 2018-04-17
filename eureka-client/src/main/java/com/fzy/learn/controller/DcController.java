package com.fzy.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fucai
 * @date 2018/4/18
 */

@RestController
public class DcController {

  @Autowired
  DiscoveryClient discoveryClient;

  /**
   * 实现/dc请求处理接口，通过DiscoveryClient对象，在日志中打印出服务实例的相关内容
   * @return
   */
  @GetMapping("/dc")
  public String dc() {
    String services = "Services: " + discoveryClient.getServices();
    System.out.println(services);
    return services;
  }

}
