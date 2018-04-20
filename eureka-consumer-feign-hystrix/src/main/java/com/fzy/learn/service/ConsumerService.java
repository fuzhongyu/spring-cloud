package com.fzy.learn.service;

import com.fzy.learn.feign_client_service.DcClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fucai
 * @date 2018/4/19
 */
@Service
public class ConsumerService {

  @Autowired
  private  DcClient dcClient;

  //函数上增加@HystrixCommand注解来指定服务降级方法
  @HystrixCommand(fallbackMethod = "fallback")
  public String consumer() {
    return dcClient.consumer();
  }

  public String fallback() {
    return "fallback";
  }

}
